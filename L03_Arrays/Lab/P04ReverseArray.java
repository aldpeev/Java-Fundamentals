package L03_Arrays.Lab;

import java.util.Scanner;

public class P04ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrStr = scanner.nextLine().split(" ");

        for (int i = 0; i < arrStr.length / 2; i++) {
            String oldIndex = arrStr[i];
            arrStr[i] = arrStr[arrStr.length - 1 - i];
            arrStr[arrStr.length - 1 - i] = oldIndex;
        }

        System.out.println(String.join(" ", arrStr));
    }
}
