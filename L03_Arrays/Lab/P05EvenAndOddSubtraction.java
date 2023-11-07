package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : intArr) {
            if ( number % 2 ==0){
                sumEven += number;
            }else {
                sumOdd += number;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
