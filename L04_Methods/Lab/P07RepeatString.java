package L04_Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(repeatString(scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
    }

    public static String repeatString (String text, int n){

        String repeatedString = "";
        for (int i = 0; i < n; i++) {
            repeatedString += text;
        }

        return repeatedString;
    }
}
