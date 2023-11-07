package L12_ExamPreparation.Prep4;

import java.util.Scanner;

public class P0TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder inputSb = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandLine = command.split("\\|");

            switch (commandLine[0]) {
                case "Move":
                    int endIndex = Integer.parseInt(commandLine[1]);

                    if (endIndex >=0 && endIndex <= inputSb.length()) {
                        String substring = inputSb.substring(0, endIndex);
                        inputSb.delete(0, endIndex);
                        inputSb.append(substring);
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(commandLine[1]);

                    if (index >= 0 && index <= inputSb.length()) {
                        inputSb.insert(index, commandLine[2]);
                    }

                    break;
                case "ChangeAll":
                    input = inputSb.toString();
                    String replaced = input.replace(commandLine[1], commandLine[2]);
                    inputSb = new StringBuilder(replaced);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", inputSb);
    }
}
