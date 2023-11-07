package L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double britishPounds = Double.parseDouble(sc.nextLine());
        System.out.printf("%.3f", britishPounds * 1.36);
    }
}
