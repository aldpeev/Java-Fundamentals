package L07_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int countBlackListed = 0;
        int countLost = 0;

        String command = scanner.nextLine();
        while (!command.equals("Report")) {
            String[] commandLine = command.split(" ");
            switch (commandLine[0]) {
                case "Blacklist":
                    if (nameList.contains(commandLine[1])) {
                        nameList.set(nameList.indexOf(commandLine[1]), "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", commandLine[1]);
                        countBlackListed++;
                    } else {
                        System.out.printf("%s was not found.%n", commandLine[1]);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(commandLine[1]);
                    if (isValidIndex(nameList, index)) {
                        if (!nameList.get(index).equals("Blacklisted") && !nameList.get(index).equals("Lost")) {
                            System.out.printf("%s was lost due to an error.%n", nameList.get(index));
                            nameList.set(index, "Lost");
                            countLost++;
                        }
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(commandLine[1]);
                    if (isValidIndex(nameList, index1)){
                        String currentName = nameList.get(index1);
                        nameList.set(index1, commandLine[2]);
                        System.out.printf("%s changed his username to %s.%n",currentName,commandLine[2]);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", countBlackListed);
        System.out.printf("Lost names: %d%n", countLost);
        System.out.println(String.join(" ", nameList));
    }

    public static boolean isValidIndex(List<String> list, int index) {
        return index >= 0 && index < list.size();
    }
}
