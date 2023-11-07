package L06_MidExamPreparation.Prep4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] commandLine = command.split(" - ");
            String firstItem = commandLine[1];

            switch (commandLine[0]) {
                case "Collect":
                    if (!itemsList.contains(firstItem)) {
                        itemsList.add(firstItem);
                    }
                    break;
                case "Drop":
                    itemsList.remove(firstItem);
                    break;
                case "Combine Items":
                    String[] itemsArr = firstItem.split(":");
                    if (itemsList.contains(itemsArr[0])) {
                        if (itemsList.indexOf(itemsArr[0]) + 1 < itemsList.size()) {
                            itemsList.add(itemsList.indexOf(itemsArr[0]) + 1, itemsArr[1]);
                        } else {
                            itemsList.add(itemsArr[1]);
                        }
                    }
                    break;
                case "Renew":
                    if (itemsList.contains(firstItem)) {
                        String itemToMove = itemsList.get(itemsList.indexOf(firstItem));
                        itemsList.remove(firstItem);
                        itemsList.add(itemToMove);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", itemsList));
    }
}
