package L06_MidExamPreparation.Prep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int count = 0;

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("end")){
            String[] command = commandLine.split(" ");

            int firstIndex = Integer.parseInt(command[0]);
            int secondIndex = Integer.parseInt(command[1]);

            if (firstIndex < 0 || firstIndex > stringList.size() - 1 || secondIndex < 0 || secondIndex > stringList.size() - 1){
                count++;
                stringList.add(stringList.size() / 2, "-" + count + "a");
                stringList.add(stringList.size() / 2, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
                commandLine = scanner.nextLine();
                continue;
            }

            String firstEl = stringList.get(firstIndex);
            String secondEl = stringList.get(secondIndex);

            if (firstIndex == secondIndex){
                count++;
                stringList.add(stringList.size() / 2, "-" + count + "a");
                stringList.add(stringList.size() / 2, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
                commandLine = scanner.nextLine();
                continue;
            }

            if (firstEl.equals(secondEl)){
                stringList.remove(firstEl);
                stringList.remove(secondEl);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstEl);
            } else {
                System.out.println("Try again!");
            }
            count++;

            if (stringList.isEmpty()){
                System.out.printf("You have won in %d turns!",count);
                break;
            }

            commandLine = scanner.nextLine();
        }

        if (!stringList.isEmpty()){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",stringList));
        }
    }

}



