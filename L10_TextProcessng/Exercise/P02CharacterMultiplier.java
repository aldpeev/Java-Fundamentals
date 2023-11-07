package L10_TextProcessng.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        System.out.println(charMultiplier(input[0], input[1]));
    }

    public static int charMultiplier(String str1, String str2) {

        int minLength = str1.length();
        String maxLengthStr = str2;

        if (str1.length() > str2.length()) {
            minLength = str2.length();
            maxLengthStr = str1;
        }

        int sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }

        String remainingChars = maxLengthStr.substring(minLength);
        for (int i = 0; i < remainingChars.length(); i++) {
            sum += remainingChars.charAt(i);
        }

        return sum;
    }
}
