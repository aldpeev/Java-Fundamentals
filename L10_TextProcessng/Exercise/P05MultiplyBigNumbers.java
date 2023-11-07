package L10_TextProcessng.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        System.out.println(firstNum.multiply(secondNum));

    }
}
