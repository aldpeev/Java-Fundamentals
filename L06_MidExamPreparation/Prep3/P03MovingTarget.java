package L06_MidExamPreparation.Prep3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split(" ");
            int index = Integer.parseInt(commandArr[1]);
            int actionNumber = Integer.parseInt(commandArr[2]);

            switch (commandArr[0]) {
                case "Shoot":
                    if (index >= 0 && index < targetsList.size()) {
                        if (targetsList.get(index) - actionNumber > 0) {
                            targetsList.set(index, targetsList.get(index) - actionNumber);
                        } else {
                            targetsList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targetsList.size()) {
                        targetsList.add(index, actionNumber);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index >= 0 && index < targetsList.size()) {
                        if (index - actionNumber >= 0 && index + actionNumber < targetsList.size()) {
                            int startIndex = index - actionNumber;
                            int endIndex = index + actionNumber;

                            targetsList.subList(startIndex,endIndex + 1).clear();

                        } else {
                            System.out.println("Strike missed!");
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        List<String> stringResult = new ArrayList<>();

        for (int el : targetsList){
            stringResult.add(String.valueOf(el));
        }

        System.out.println(String.join("|",stringResult));

    }
}
