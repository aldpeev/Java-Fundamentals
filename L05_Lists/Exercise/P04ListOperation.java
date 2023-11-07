package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("End")) {

            switch (commandLine[0]) {
                case "Add":
                    numList.add(Integer.valueOf(commandLine[1]));
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(commandLine[2]);
                    if (index1 >= 0 && index1 < numList.size()){
                        numList.add(index1, Integer.valueOf(commandLine[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandLine[1]);
                    if (index >= 0 &&  index < numList.size()){
                        numList.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int n = Integer.parseInt(commandLine[2]);
                    switch (commandLine[1]) {
                        case "left":
                            for (int i = 0; i < n; i++) {
                                int firstEl = numList.get(0);

                                numList.add(firstEl);
                                numList.remove(0);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < n; i++) {
                                int lastEl = numList.get(numList.size() - 1);

                                numList.add(0, lastEl);
                                numList.remove(numList.size() - 1);
                            }
                            break;
                    }
                    break;
            }
            commandLine = scanner.nextLine().split(" ");
        }

        for (int el : numList){
            System.out.print(el + " ");
        }

    }
}
