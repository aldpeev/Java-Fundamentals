package L10_TextProcessng.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                digits.append(text.charAt(i));
            } else if (Character.isLetter(text.charAt(i))){
                letters.append(text.charAt(i));
            } else {
                others.append(text.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
