package L12_ExamPreparation.Prep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder destinationSb = new StringBuilder(scanner.nextLine());
        String initialAsString = destinationSb.toString();
        String resultText = "";

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandLine = command.split(":");
            switch (commandLine[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(commandLine[1]);
                    if (index >= 0 && index <= destinationSb.length()) {
                        destinationSb.insert(index, commandLine[2]);
                    }
                    System.out.println(destinationSb);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex = Integer.parseInt(commandLine[2]);
                    if (startIndex >= 0 && endIndex < destinationSb.length()) {
                        destinationSb.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(destinationSb);
                    break;
                case "Switch":
                    if (initialAsString.contains(commandLine[1])){
                        resultText = destinationSb.toString();
                        resultText = resultText.replaceAll(commandLine[1], commandLine[2]);
                        System.out.println(resultText);
                    } else {
                        System.out.println(destinationSb);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (resultText.equals("")){
            System.out.printf("Ready for world tour! Planned stops: %s%n", destinationSb);
        } else {
            System.out.printf("Ready for world tour! Planned stops: %s%n", resultText);
        }
    }
}
