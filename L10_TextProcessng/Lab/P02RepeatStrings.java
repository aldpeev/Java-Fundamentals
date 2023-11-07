package L10_TextProcessng.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder resultSb = new StringBuilder();

        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                resultSb.append(arr[i]);
            }
        }
        System.out.println(resultSb);
    }
}
