package L04_Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        calculations(command, firstNum, secondNum);
    }

    public static void calculations (String command, int firstNum, int secondNum){
        switch (command){
            case "add":
                add(firstNum,secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum,secondNum);
                break;
            case "divide":
                divide(firstNum,secondNum);
                break;
        }
    }

    public static void add (int num, int num2){
        System.out.println(num + num2);
    }

    public static void multiply (int num, int num2){
        System.out.println(num * num2);
    }

    public static void subtract (int num, int num2){
        System.out.println( num - num2);
    }

    public static void divide (int num, int num2){
        System.out.println(num / num2);
    }
}
