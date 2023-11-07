package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isDiff = false;
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] != arrTwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isDiff = true;
                break;
            } else {
                sum += arrOne[i];
            }
        }
        if (!isDiff){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
