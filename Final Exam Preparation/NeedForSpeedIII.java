package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileage = new LinkedHashMap<>();

        Map<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int initialMileage = Integer.parseInt(input[1]);
            int initialFuel = Integer.parseInt(input[2]);
            carMileage.put(car, initialMileage);
            carFuel.put(car, initialFuel);
        }

        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] data = line.split(" : ");
            String command = data[0];
            String carModel = data[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuelNeeded = Integer.parseInt(data[3]);
                    if (carFuel.get(carModel) < fuelNeeded) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int updateMileage = carMileage.get(carModel) + distance;
                        int fuelLeft = carFuel.get(carModel) - fuelNeeded;
                        carMileage.put(carModel, updateMileage);
                        carFuel.put(carModel, fuelLeft);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                carModel, distance, fuelNeeded);
                    }
                    if (carMileage.get(carModel) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", carModel);
                        carMileage.remove(carModel);
                        carFuel.remove(carModel);
                    }
                    break;
                case "Refuel":
                    int fuelRefill = Integer.parseInt(data[2]);
                    int tankRefill = carFuel.get(carModel) + fuelRefill;
                    if (tankRefill > 75) {
                        int fuelCapacity = Math.abs(tankRefill - 75 - fuelRefill);
                        tankRefill = 75;
                        System.out.printf("%s refueled with %d liters%n", carModel, fuelCapacity);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", carModel, fuelRefill);
                    }
                    carFuel.put(carModel, tankRefill);
                    break;
                case "Revert":
                    int kilometres = Integer.parseInt(data[2]);
                    int updateMileage = carMileage.get(carModel) - kilometres;
                    if (updateMileage < 10000) {
                        updateMileage = 10000;
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", carModel, kilometres);
                    }
                    carMileage.put(carModel, updateMileage);
                    break;
            }

            line = scanner.nextLine();
        }
        carMileage.entrySet().stream().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    entry.getKey(), entry.getValue(), carFuel.get(entry.getKey()));
        });
    }
}
