package L10_TextProcessng.Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            resultSb.append(Character.toChars(input.charAt(i) + 3));
        }
        System.out.println(resultSb);
    }
}
