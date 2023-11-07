package L06_MidExamPreparation.Prep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingLIst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] commandLine = command.split(" ");
            String action = commandLine[0];
            String itemAction = commandLine[1];

            switch (action) {
                case "Urgent":
                    if (!stringList.contains(itemAction)) {
                        stringList.add(0, itemAction);
                    }
                    break;
                case "Unnecessary":
                    stringList.removeIf(e -> e.contains(itemAction));
                    break;
                case "Correct":
                    String newItem = commandLine[2];
                    if (stringList.contains(itemAction)) {
                        int index = stringList.indexOf(itemAction);
                        stringList.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (stringList.contains(itemAction)){
                        stringList.remove(itemAction);
                        stringList.add(itemAction);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ",stringList));
    }
}
