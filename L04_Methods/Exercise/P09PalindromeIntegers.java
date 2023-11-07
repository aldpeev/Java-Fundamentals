package L04_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            int number = Integer.parseInt(command);

            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            command = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int number) {

        int[] arr = Arrays.stream(Integer.toString(number).split("")).mapToInt(Integer::parseInt).toArray();

        boolean isPalindrome = false;
        if (arr.length < 2) {
            isPalindrome = true;
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == arr[arr.length - 1 - i]) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }


        return isPalindrome;
    }
}

