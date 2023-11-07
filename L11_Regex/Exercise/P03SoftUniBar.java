package L11_Regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%[^\\|\\$\\%\\.]*<(?<product>\\w+)>[^\\|\\$\\%\\.]*\\|(?<count>\\d+)\\|[^\\|\\$\\%\\.]*?(?<price>\\d+(\\.\\d+)?)\\$";
        Pattern p = Pattern.compile(regex);

        double totalSum = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")){
            Matcher m = p.matcher(input);

            String customer = "";
            String product = "";
            double price = 0.0;
            if (m.find()){
                customer = m.group("customer");
                product = m.group("product");
                price = Integer.parseInt(m.group("count")) * Double.parseDouble(m.group("price"));
                totalSum += price;
                System.out.printf("%s: %s - %.2f%n",customer, product, price);
            }


            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalSum);
    }
}
