package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = arr.length;
        while (count > 1){
            int[] newArr = new int[arr.length - 1];
            for (int j = 0; j < newArr.length; j++) {
                newArr[j] = arr[j] + arr[j + 1];
            }
            arr = newArr;
            count--;
        }

        System.out.println(arr[0]);
    }
}

