package MidExamFebruary2022;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPricePerPackage = Double.parseDouble(scanner.nextLine());
        double singleEggPrice = Double.parseDouble(scanner.nextLine());
        double singleApronPrice = Double.parseDouble(scanner.nextLine());

        double totalEggPrice = singleEggPrice * 10 * (students);
        double totalApronPrice = Math.ceil(students + (students * 0.20)) * singleApronPrice;
        double totalFlourPrice = flourPricePerPackage * students;
        int countStudent = students / 5;
        if (countStudent > 0) {
            totalFlourPrice = flourPricePerPackage * (students - countStudent);
        }

        double totalPrice = totalFlourPrice + totalEggPrice + totalApronPrice;

        if (budget - totalPrice >= 0) {
            System.out.printf("Items purchased for %.2f$.%n", totalPrice);
        } else {
            System.out.printf("%.2f$ more needed.%n", totalPrice - budget);
        }
    }
}
