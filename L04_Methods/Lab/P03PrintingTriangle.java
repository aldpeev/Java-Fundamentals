package L04_Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printingTriangle(Integer.parseInt(scanner.nextLine()));
    }

    public static void printingTriangle (int num){

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = num; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}



