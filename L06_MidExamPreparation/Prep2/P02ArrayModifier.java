package L06_MidExamPreparation.Prep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("end")){
            String[] command = commandLine.split(" ");
            String action = command[0];

            switch (action){
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);

                    int firstEl = numList.get(index1);
                    int secondEl = numList.get(index2);

                    numList.set(index1,secondEl);
                    numList.set(index2,firstEl);
                    break;
                case "multiply":
                    int index = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);

                    int result = numList.get(index) * numList.get(secondIndex);
                    numList.set(index, result);
                    break;
                case "decrease":
                    for (int i = 0; i < numList.size(); i++) {
                        numList.set(i, numList.get(i) - 1);
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }

        for (int i = 0; i < numList.size() - 1; i++) {
            System.out.print(numList.get(i) + ", ");
        }
        System.out.print(numList.get(numList.size() - 1));
    }
}
