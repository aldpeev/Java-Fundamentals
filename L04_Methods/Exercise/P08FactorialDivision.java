package L04_Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        long first = factorial(a);
        long second = factorial(b);

        double result = 1.0 * first / second;

        System.out.printf("%.2f", result);
    }

    public static long factorial (int n){

        long sum = 1;

        for (int i = 1; i <= n ; i++) {
            sum *= i;
        }

        return sum;
    }
}
