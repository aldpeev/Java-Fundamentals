package L04_Methods.Lab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        grade(Double.parseDouble(scanner.nextLine()));

    }

    public static void grade (double num){

        String grade = "";

        if (num <= 2.99){
            grade = "Fail";
        } else if (num <= 3.49){
            grade = "Poor";
        } else if (num <= 4.49){
            grade = "Good";
        } else if (num <= 5.49){
            grade = "Very good";
        } else {
            grade = "Excellent";
        }

        System.out.println(grade);
    }
}
