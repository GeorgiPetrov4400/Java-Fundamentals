package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] data = input.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (activationKey.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String commandCase = data[1];
                    int startIndex = Integer.parseInt(data[2]);
                    int endIndex = Integer.parseInt(data[3]);
                    if (commandCase.equals("Upper")) {
                        String upperCase = activationKey.substring(startIndex, endIndex).toUpperCase();
                        activationKey.delete(startIndex, endIndex);
                        activationKey.insert(startIndex, upperCase);
                        System.out.println(activationKey);
                    } else if (commandCase.equals("Lower")) {
                        String lowerCase = activationKey.substring(startIndex, endIndex).toLowerCase();
                        activationKey.delete(startIndex, endIndex);
                        activationKey.insert(startIndex, lowerCase);
                        System.out.println(activationKey);
                    }
                    break;
                case "Slice":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
                    activationKey.delete(start, end);
                    System.out.println(activationKey);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
