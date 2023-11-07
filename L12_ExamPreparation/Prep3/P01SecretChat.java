package L12_ExamPreparation.Prep3;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialText = scanner.nextLine();
        StringBuilder textSb = new StringBuilder(initialText);

        String command = scanner.nextLine();
        while (!command.equals("Reveal")){
            String[] commandLine = command.split(":\\|:");

            switch (commandLine[0]){
                case "InsertSpace":
                    textSb.insert(Integer.parseInt(commandLine[1]), " ");
                    System.out.println(textSb);
                    break;
                case "Reverse":
                    initialText = textSb.toString();
                    if (initialText.contains(commandLine[1])){
                        int startIndex = textSb.indexOf(commandLine[1]);
                        int endIndex = startIndex + commandLine[1].length();

                        StringBuilder sbReversed = new StringBuilder(textSb.substring(startIndex,endIndex));
                        textSb.delete(startIndex, endIndex);
                        textSb.append(sbReversed.reverse());
                        System.out.println(textSb);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    initialText = textSb.toString();
                    initialText = initialText.replaceAll(commandLine[1], commandLine[2]);
                    System.out.println(initialText);
                    textSb = new StringBuilder(initialText);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", textSb);
    }
}
