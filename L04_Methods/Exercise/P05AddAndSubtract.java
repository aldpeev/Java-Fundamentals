package L04_Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(a,b,c));

    }

    public static int sum (int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int subtract (int firstNum, int secondNum, int thirdNum){
        return sum(firstNum,secondNum) - thirdNum;
    }
}
