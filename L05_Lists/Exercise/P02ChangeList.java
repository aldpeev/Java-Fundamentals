package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("end")){
            switch (commandLine[0]){
                case "Insert":
                    int index = Integer.parseInt(commandLine[2]);
                    int numToAdd = Integer.parseInt(commandLine[1]);
                    numList.add(index, numToAdd);
                    break;
                case "Delete":
                    int element = Integer.parseInt(commandLine[1]);
                    numList.removeIf(e -> e.equals(Integer.valueOf(element)));
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }

        for (int el : numList){
            System.out.print(el + " ");
        }
    }
}
