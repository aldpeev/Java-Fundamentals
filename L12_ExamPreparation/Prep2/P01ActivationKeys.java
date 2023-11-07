package L12_ExamPreparation.Prep2;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialText = scanner.nextLine();
        StringBuilder textSb = new StringBuilder(initialText);

        String command = scanner.nextLine();
        while (!command.equals("Generate")){

            String[] commandLine = command.split(">>>");
            switch (commandLine[0]){
                case "Contains":
                    initialText = textSb.toString();
                    if (initialText.contains(commandLine[1])){
                        System.out.printf("%s contains %s%n", initialText, commandLine[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String caseSensitive = commandLine[1];
                    int startIndex = Integer.parseInt(commandLine[2]);
                    int endIndex = Integer.parseInt(commandLine[3]);
                    String substringToManipulate = textSb.substring(startIndex,endIndex);

                    if (caseSensitive.equals("Upper")){
                        substringToManipulate = substringToManipulate.toUpperCase();
                    } else {
                        substringToManipulate = substringToManipulate.toLowerCase();
                    }
                    textSb.replace(startIndex, endIndex, substringToManipulate);
                    System.out.println(textSb);
                    break;
                case "Slice":
                    textSb.delete(Integer.parseInt(commandLine[1]), Integer.parseInt(commandLine[2]));
                    System.out.println(textSb);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", textSb);
    }
}
