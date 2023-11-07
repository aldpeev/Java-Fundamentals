package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highestSnowballValue = Integer.MIN_VALUE;
        int snowBallBiggest = 0;
        int snowBallTimeBiggest = 0;
        int snowBallQualityBiggest = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double result = Math.pow(snowballSnow / (double) snowballTime, snowballQuality);
            if (result > highestSnowballValue) {
                highestSnowballValue = result;
                snowBallBiggest = snowballSnow;
                snowBallTimeBiggest = snowballTime;
                snowBallQualityBiggest = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowBallBiggest, snowBallTimeBiggest, highestSnowballValue, snowBallQualityBiggest);

    }
}
