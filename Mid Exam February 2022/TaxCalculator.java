package MidExamFebruary2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> vehicles = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());

        int initialTaxFamily = 50;
        int initialTaxHeavyDuty = 80;
        int initialTaxSports = 100;
        //7210 / 3000 * 12 + (50 - 3 * 5) = 59.00 euros
        double totalTaxes = 0.0;
        for (String car : vehicles) {
            String[] data = car.split("\\s+");
            String carType = data[0];
            switch (carType) {
                case "family":
                    //double taxFamilyVehicle = (Math.floor(Integer.parseInt(data[2]) * 1.0 / 3000) * 12 + (initialTaxFamily - Integer.parseInt(data[1])) * 5);
                    double taxPerKmFamily = Math.floor(Double.parseDouble(data[2]) / 3000) * 12;
                    double taxPerYearsFamily = initialTaxFamily - (Double.parseDouble(data[1]) * 5);
                    double totalTaxFamily = taxPerKmFamily + taxPerYearsFamily;
                    totalTaxes += totalTaxFamily;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTaxFamily);
                    break;
                case "heavyDuty":
                    //double taxHeavyDutyVehicle = (Math.floor(Integer.parseInt(data[2]) * 1.0 / 9000) * 14 + (initialTaxHeavyDuty - Integer.parseInt(data[1])) * 8);
                    double taxPerKmHeavyDuty = Math.floor(Double.parseDouble(data[2]) / 9000) * 14;
                    double taxPerYearsHeavyDuty = initialTaxHeavyDuty - (Double.parseDouble(data[1]) * 8);
                    double totalTaxHeavyDuty = taxPerKmHeavyDuty + taxPerYearsHeavyDuty;
                    totalTaxes += totalTaxHeavyDuty;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTaxHeavyDuty);
                    break;
                case "sports":
                    //double taxSportVehicle = (Math.floor(Integer.parseInt(data[2]) * 1.0 / 2000) * 18 + (initialTaxSports - Integer.parseInt(data[1])) * 9);
                    double taxPerKmSport = Math.floor(Double.parseDouble(data[2]) / 2000) * 18;
                    double taxPerYearsSport = initialTaxSports - (Double.parseDouble(data[1]) * 9);
                    double totalTaxSport = taxPerKmSport + taxPerYearsSport;
                    totalTaxes += totalTaxSport;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTaxSport);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTaxes);
    }
}
