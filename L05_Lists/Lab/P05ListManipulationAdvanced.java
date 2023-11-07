package L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("end")) {

            switch (commandLine[0]) {
                case "Contains":
                    if (numList.contains(Integer.valueOf(commandLine[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandLine[1].equals("even")) {
                        for (int el : numList) {
                            if (el % 2 == 0) {
                                System.out.print(el + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int el : numList) {
                            if (el % 2 == 1) {
                                System.out.print(el+ " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    System.out.println(numList.stream().mapToInt(Integer::intValue).sum());
                    break;
                case "Filter":
                    int conditionNum = Integer.parseInt(commandLine[2]);
                    switch (commandLine[1]){
                        case "<":
                            for (int el : numList){
                                if (el < conditionNum ){
                                    System.out.print(el + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int el : numList){
                                if (el > conditionNum ){
                                    System.out.print(el + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int el : numList){
                                if (el >= conditionNum ){
                                    System.out.print(el + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int el : numList){
                                if (el <= conditionNum ){
                                    System.out.print(el + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }
    }
}
