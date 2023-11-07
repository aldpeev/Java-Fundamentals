package L04_Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        smallestNumber(a, b, c);

    }

    public static void smallestNumber(int a, int b, int c) {

        int smallest = 0;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println(smallest);
    }
}
