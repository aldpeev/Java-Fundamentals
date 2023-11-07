package L13_FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern p = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<text>[A-Za-z]{8,})\\]");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher m = p.matcher(input);
            if (m.find()) {

                String command = m.group("command");
                System.out.print(command + ":");

                String text = m.group("text");
                for (char el : text.toCharArray()) {
                    if (Character.isLetter(el)) {
                        System.out.print(" " + (int) el);
                    }
                }
                System.out.println();


            } else {
                System.out.println("The message is invalid");
            }

        }
    }
}
