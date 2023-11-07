package L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        char thirdChar = scanner.next().charAt(0);

        String result = String.format("%c %c %c", thirdChar, secondChar, firstChar);
        System.out.println(result);
    }
}
