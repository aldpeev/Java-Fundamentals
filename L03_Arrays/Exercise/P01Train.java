package L03_Arrays.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];
            System.out.printf("%d ", people[i]);
        }
        System.out.println();
        System.out.print(sum);
    }
}
