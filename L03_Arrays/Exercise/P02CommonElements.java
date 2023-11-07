package L03_Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        String commonEl = "";
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (secondArr[j].equals(firstArr[i])) {
                    commonEl = commonEl + firstArr[i] + " ";
                }
            }
        }
        System.out.println(commonEl);
    }
}
