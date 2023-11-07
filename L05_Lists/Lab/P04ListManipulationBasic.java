package L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("end")){
            int firstNum = Integer.parseInt(commandLine[1]);

             switch (commandLine[0]){
                 case "Add":
                     numList.add(firstNum);
                     break;
                 case "Remove":
                     numList.remove(Integer.valueOf(firstNum));
                     break;
                 case "RemoveAt":
                     numList.remove(firstNum);
                     break;
                 case "Insert":
                     numList.add(Integer.valueOf(commandLine[2]), firstNum);
                     break;
             }

            commandLine = scanner.nextLine().split(" ");
        }

        for (int el : numList){
            System.out.print(el + " ");
        }
    }
}
