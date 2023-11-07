package L04_Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(middleCharacter(scanner.nextLine()));
    }

    public static String middleCharacter(String text) {

        char middle = ' ';
        char middleEven = ' ';

        if (text.length() % 2 == 0) {
            middle = text.charAt(text.length() / 2);
            middleEven = text.charAt((text.length() / 2) - 1);
            return middleEven + String.valueOf(middle);
        } else {
            middle = text.charAt(text.length() / 2);
            return String.valueOf(middle);
        }

    }
}
