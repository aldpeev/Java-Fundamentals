package L10_TextProcessng.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String el : bannedWords) {
            text = text.replace(el,"*".repeat(el.length()));
        }

        System.out.println(text);

    }
}
