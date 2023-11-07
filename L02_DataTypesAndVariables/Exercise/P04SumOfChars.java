package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char character = scanner.next().charAt(0);
            sum += character;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
