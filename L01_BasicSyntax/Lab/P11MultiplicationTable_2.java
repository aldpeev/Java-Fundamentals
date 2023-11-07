package L01_BasicSyntax.Lab;

import java.util.Scanner;

public class P11MultiplicationTable_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());

        if (start > 10) {
            System.out.printf("%d X %d = %d%n", n, start, n * start);
        } else {
            for (int i = start; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
    }
}
