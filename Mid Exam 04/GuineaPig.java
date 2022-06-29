package ProgrammingFundamentalsMidExam04;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKgPerMonth = Double.parseDouble(scanner.nextLine());
        ;
        double hayKgPerMonth = Double.parseDouble(scanner.nextLine());
        ;
        double coverKgPerMonth = Double.parseDouble(scanner.nextLine());
        ;
        double weightKg = Double.parseDouble(scanner.nextLine());
        ;

        int countDays = 0;
        double foodInGrams = foodKgPerMonth * 1000;
        double hayInGrams = hayKgPerMonth * 1000;
        double coverInGrams = coverKgPerMonth * 1000;
        double weightInGrams = weightKg * 1000;

        while (foodInGrams >= 0 || hayInGrams >= 0 || coverInGrams >= 0) {
            countDays++;
            foodInGrams -= 300;
            if (countDays % 2 == 0) {
                double hayPercent = foodInGrams * 0.05;
                hayInGrams -= hayPercent;
            }
            if (countDays % 3 == 0) {
                double coverQuantity = weightInGrams / 3;
                coverInGrams -= coverQuantity;
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
            if (countDays == 30) {
                break;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
    }
}
