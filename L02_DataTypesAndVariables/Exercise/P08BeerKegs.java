package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggestKegModel = "";
        double biggestKegSize = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double result = Math.PI * Math.pow(radius,2) * height;
            if (result > biggestKegSize){
                biggestKegSize = result;
                biggestKegModel = modelKeg;
            }

        }
        System.out.println(biggestKegModel);
    }
}
