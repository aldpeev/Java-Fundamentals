package L04_Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);

        printCharsInRange(firstChar, secondChar);
    }

    public static void printCharsInRange(char firstChar, char secondChar) {

        int start = Math.min(firstChar,secondChar);
        int end = Math.max(firstChar,secondChar);

        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
