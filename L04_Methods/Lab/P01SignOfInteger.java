package L04_Methods.Lab;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        integerSign(Integer.parseInt(scanner.nextLine()));
    }

    public static void integerSign (int num){

        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
