package ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    static class Catalogue {
        String vehicleType;
        String vehicleModel;
        String vehicleColor;
        int vehicleHorsepower;

        public Catalogue(String vehicleType, String vehicleModel, String vehicleColor, int vehicleHorsepower) {
            this.vehicleType = vehicleType;
            this.vehicleModel = vehicleModel;
            this.vehicleColor = vehicleColor;
            this.vehicleHorsepower = vehicleHorsepower;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public String getVehicleModel() {
            return vehicleModel;
        }

        public String getVehicleColor() {
            return vehicleColor;
        }

        public int getVehicleHorsepower() {
            return vehicleHorsepower;
        }

        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d",
                    getVehicleType().toUpperCase().charAt(0) + getVehicleType().substring(1), getVehicleModel(), getVehicleColor(), getVehicleHorsepower());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Catalogue> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            Catalogue catalogue = new Catalogue(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(catalogue);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String model = input;
            vehicleList.stream().filter(catalogue -> catalogue.getVehicleModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }
        List<Catalogue> cars = vehicleList.stream().filter(vehicle -> vehicle.getVehicleType().equals("car"))
                .collect(Collectors.toList());

        List<Catalogue> trucks = vehicleList.stream().filter(vehicle -> vehicle.getVehicleType().equals("truck"))
                .collect(Collectors.toList());

        //double averageCarsHP = cars.stream().mapToDouble(Catalogue::getVehicleHorsepower).sum() / cars.size();
        //double averageTrucksHP = trucks.stream().mapToDouble(Catalogue::getVehicleHorsepower).sum() / trucks.size();
        double averageCarsHP = averageHorsepower(cars);
        double averageTrucksHP = averageHorsepower(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHP);
    }

    static double averageHorsepower(List<Catalogue> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Catalogue::getVehicleHorsepower).sum() / vehicles.size();
    }
}
