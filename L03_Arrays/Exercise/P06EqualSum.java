package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isValid = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = i; j >= 0; j--) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            leftSum -= arr[i];
            rightSum -= arr[i];

            if (leftSum == rightSum) {
                isValid = true;
                index = i;
            }
        }

       if (isValid){
           System.out.println(index);
       } else {
           System.out.println("no");
       }

    }
}
