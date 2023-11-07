package L04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = mathPower(Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));

        DecimalFormat df = new DecimalFormat("#####.####");
        System.out.println(df.format(result));
    }

    public static double mathPower (double num, int power){

        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= num;
        }

        return result;
    }
}
