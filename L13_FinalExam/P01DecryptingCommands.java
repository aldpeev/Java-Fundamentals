package L13_FinalExam;

import java.util.Scanner;

public class P01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] commandLine = command.split(" ");
            switch (commandLine[0]) {
                case "Replace":
                    input = input.replaceAll(commandLine[1], commandLine[2]);
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]) + 1;

                    if (startIndex >= 0 && endIndex <= input.length()) {
                        String textToRemove = input.substring(startIndex, endIndex);
                        input = input.replace(textToRemove, "");
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    switch (commandLine[1]) {
                        case "Upper":
                            input = input.toUpperCase();
                            break;
                        case "Lower":
                            input = input.toLowerCase();
                            break;
                    }
                    System.out.println(input);
                    break;
                case "Check":
                    if (input.contains(commandLine[1])) {
                        System.out.println("Message contains " + commandLine[1]);
                    } else {
                        System.out.println("Message doesn't contain " + commandLine[1]);
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt(commandLine[1]);
                    int end = Integer.parseInt(commandLine[2]) + 1;

                    if (start >= 0 && end <= input.length()){
                        String substring = input.substring(start, end);

                        int sum = 0;
                        for (char el: substring.toCharArray()){
                            sum += el;
                        }

                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
