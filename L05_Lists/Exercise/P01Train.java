package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("end")){

            if (commandLine[0].equals("Add")){
                numList.add(Integer.valueOf(commandLine[1]));
            } else {
                int passengersToAdd = Integer.parseInt(commandLine[0]);
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) + passengersToAdd <= capacity){
                        numList.set(i, Integer.valueOf(numList.get(i) + passengersToAdd));
                        break;
                    }
                }
            }

            commandLine = scanner.nextLine().split(" ");
        }

        for (int el : numList){
            System.out.print(el + " ");
        }
    }
}
