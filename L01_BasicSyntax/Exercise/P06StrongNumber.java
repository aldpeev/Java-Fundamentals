package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());
        int num = numInput;

        int factSum = 0;
        while (num > 0) {
            int sum = 1;
            int numLastDigit = num % 10;
            for (int i = 0; i < numLastDigit; i++) {
                sum *= numLastDigit - i;
            }
            factSum += sum;
            num /= 10;
        }
        if (numInput == factSum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
