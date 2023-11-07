package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabresPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabresCount = students + Math.ceil(students * 0.1);

        int freeBeltsCount = 0;
        if (students >= 6) {
            freeBeltsCount = students / 6;
        }

        double sabresTotal = lightsabresPrice * sabresCount;
        double robesTotal = robesPrice * students;

        double beltsTotal = 0;
        if (freeBeltsCount > 0) {
            beltsTotal = (beltsPrice * students) - (beltsPrice * freeBeltsCount);
        } else {
            beltsTotal = beltsPrice * students;
        }

        double totalPrice = sabresTotal + robesTotal + beltsTotal;

        if (totalPrice <= money){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - money));
        }
    }
}
