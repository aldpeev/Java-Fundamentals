package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int totalSpice = 0;
        int daysOperating = 0;

        while (yield >= 100){
            totalSpice += yield - 26;
            daysOperating ++;
            yield -= 10;
        }

        System.out.println(daysOperating);

        if (totalSpice >= 26){
            System.out.println(totalSpice - 26);
        }else {
            System.out.println(0);
        }
    }
}
