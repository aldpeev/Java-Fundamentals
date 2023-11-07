package L04_Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(multiplyEvenByOdds(Math.abs(Integer.parseInt(scanner.nextLine()))));
    }

    public static int multiplyEvenByOdds (int num){
        String numLength = Integer.toString(num);

        int[] arr = Arrays.stream(numLength.split("")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }

        }

        return sumEven * sumOdd;
    }
}
