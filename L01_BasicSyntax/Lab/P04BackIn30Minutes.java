package L01_BasicSyntax.Lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTimeAfterThirty = (hours * 60) + minutes + 30;

        int hoursAfterThirty = totalTimeAfterThirty / 60;
        int minutesAfterThirty = totalTimeAfterThirty % 60;

        if (hoursAfterThirty == 24){
            hoursAfterThirty = 0;
        }

        System.out.printf("%01d:%02d", hoursAfterThirty, minutesAfterThirty);

    }
}
