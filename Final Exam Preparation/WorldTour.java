package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder destination = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] data = input.split(":");
            String command = data[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String newStop = data[2];
                    if (index >= 0 && index < destination.length()) {
                        destination.insert(index, newStop);
                        System.out.println(destination);
                    } else {
                        System.out.println(destination);
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (startIndex >= 0 && startIndex < destination.length() && endIndex >= 0 && endIndex < destination.length()) {
                        destination.delete(startIndex, endIndex + 1);
                        System.out.println(destination);
                    } else {
                        System.out.println(destination);
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Switch":
                    String oldDestination = data[1];
                    String newDestination = data[2];
                    if (destination.toString().contains(oldDestination)) {
                        String replaceDestination = destination.toString().replace(oldDestination, newDestination);
                        destination.setLength(0);
                        destination.append(replaceDestination);
                        System.out.println(destination);
                        break;
                    } else {
                        System.out.println(destination);
                        input = scanner.nextLine();
                        continue;
                    }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", destination);
    }
}
