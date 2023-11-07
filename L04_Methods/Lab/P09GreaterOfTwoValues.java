package L04_Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "int":
                System.out.println(getMax(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine())));
                break;
            case "char":
                System.out.println(getMax(scanner.next().charAt(0), scanner.next().charAt(0)));
                break;
            case "string":
                System.out.println(getMax(scanner.nextLine(), scanner.nextLine()));
                break;
        }


    }

    public static int getMax(int firstNum, int secondNum) {

        if (firstNum > secondNum) {
            return firstNum;
        }

        return secondNum;
    }

    public static char getMax(char firstChar, char secondChar) {

        if (firstChar > secondChar){
            return  firstChar;
        }
        return secondChar;
    }

    public static String getMax (String firstString, String secondString){

        if (firstString.compareTo(secondString) > 0){
            return firstString;
        }

        return secondString;
    }
}
