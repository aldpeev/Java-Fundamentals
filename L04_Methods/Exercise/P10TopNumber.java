package L04_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        topNumber(Integer.parseInt(scanner.nextLine()));
    }


    private static void topNumber (int number){


        for (int i = 1; i <= number ; i++) {
            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                int currentNumLastDigit = currentNum % 10;
                sum += currentNumLastDigit;
                currentNum /= 10;
            }

            if (sum % 8 == 0){
                int currentNumEvenOrOdd = i;
                boolean isOdd = false;

                while (currentNumEvenOrOdd > 0) {
                    int currentNumLastDigit = currentNumEvenOrOdd % 10;
                    if (currentNumLastDigit % 2 != 0){
                        isOdd = true;
                        break;
                    } else {
                        currentNumEvenOrOdd /= 10;
                    }
                }

                if (isOdd){
                    System.out.println(i);
                }
            }
        }
    }

}
