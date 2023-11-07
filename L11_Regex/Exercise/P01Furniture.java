package L11_Regex.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureList = new ArrayList<>();
        Pattern p = Pattern.compile(">>([A-Za-z]+)<<(?<price>\\d+(\\.\\d+)?)!(\\d+)");

        double purchaseSum = 0.0;
        String input = scanner.nextLine();
        while (!input.equals("Purchase")){
            Matcher m = p.matcher(input);

            if (m.find()){
                furnitureList.add(m.group(1));
                purchaseSum += Double.parseDouble(m.group("price")) * Integer.parseInt(m.group(4));
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        if (!furnitureList.isEmpty()){
            furnitureList.forEach(System.out::println);
        }
        System.out.printf("Total money spend: %.2f", purchaseSum);
    }
}
