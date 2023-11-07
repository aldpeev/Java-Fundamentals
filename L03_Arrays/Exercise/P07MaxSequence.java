package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sequence = 1;
        int maxSequence = 0;
        int startIndex = 0;
        int bestIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                sequence++;
            } else {
                sequence = 1;
                startIndex = i;
            }

            if (sequence > maxSequence){
                maxSequence = sequence;
                bestIndex = startIndex;
            }


        }

        System.out.println(maxSequence);
        System.out.println(startIndex);

    }
}



