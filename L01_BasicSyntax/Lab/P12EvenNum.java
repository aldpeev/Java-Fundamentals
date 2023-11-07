package L01_BasicSyntax.Lab;

import java.util.Scanner;

public class P12EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d%n", Math.abs(n));
    }
}
