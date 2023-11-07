package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {

            int firstIndex = 0;
            int secondIndex = 0;
            if (command.length == 3) {
                firstIndex = Integer.parseInt(command[1]);
                secondIndex = Integer.parseInt(command[2]);
            }

            switch (command[0]) {
                case "swap":
                    int firstEl = arr[firstIndex];
                    arr[firstIndex] = arr[secondIndex];
                    arr[secondIndex] = firstEl;
                    break;
                case "multiply":
                    int result = arr[firstIndex] * arr[secondIndex];
                    arr[firstIndex] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }
}

