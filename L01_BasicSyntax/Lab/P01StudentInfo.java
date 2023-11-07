package L01_BasicSyntax.Lab;

import java.util.Scanner;

public class P01StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double averageGrade = Double.parseDouble(sc.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);

        System.out.print(result);
    }
}
