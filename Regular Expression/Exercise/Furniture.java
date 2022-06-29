package RegularExpressionExercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "[>]{2}(?<furniture>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> purchasedFurniture = new LinkedList<>();
        double totalPrice = 0;
      //  int count = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                purchasedFurniture.add(furniture);
                double priceFurniture = price * quantity;
                totalPrice += priceFurniture;
             /*   count++;
                if (count <= 1) {
                    System.out.println("Bought furniture:");
                } else {
                    System.out.printf("%s%n", furniture);
                    continue;
                }
                System.out.printf("%s%n", furniture); */
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String text : purchasedFurniture) {
            System.out.printf("%s%n", text);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}