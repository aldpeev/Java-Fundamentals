package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < firstArr.length; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int firstNum = numbers[0];
            int secondNum = numbers[1];

            if (i % 2 == 0) {
                firstArr[i] = firstNum;
                secondArr[i] = secondNum;
            } else {
                firstArr[i] = secondNum;
                secondArr[i] = firstNum;
            }
        }

        for (int el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int el : secondArr) {
            System.out.print(el + " ");
        }
    }
}
