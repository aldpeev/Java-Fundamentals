package L04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = mathOperation(firstNum,operation,secondNum);

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(result));

    }

    public static double mathOperation ( int firstNum, String operation, int secondNum ){

        double result = 0;
        switch (operation){
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
        }

        return result;
    }
}
