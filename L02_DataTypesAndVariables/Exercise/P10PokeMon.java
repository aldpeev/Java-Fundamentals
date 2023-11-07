package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int originalPowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int targets =0;
        int powerN = originalPowerN;

        while (originalPowerN >= distanceM){
            originalPowerN -= distanceM;
            targets++;

            if (powerN * 0.5 == originalPowerN ){
                if (exhaustionFactorY != 0){
                    originalPowerN /= exhaustionFactorY;
                }
            }

        }
        System.out.println(originalPowerN);
        System.out.println(targets);
    }
}
