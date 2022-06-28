package BasicSintaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;
        switch (day) {
            case "Friday":
                switch (group) {
                    case "Students":
                        price = peopleNumber * 8.45;
                        break;
                    case "Business":
                        if (peopleNumber >= 100) {
                            price = (peopleNumber - 10) * 10.90;
                            break;
                        }
                        price = peopleNumber * 10.90;
                        break;
                    case "Regular":
                        price = peopleNumber * 15;
                        break;
                }
                break;
            case "Saturday":
                switch (group) {
                    case "Students":
                        price = peopleNumber * 9.80;
                        break;
                    case "Business":
                        if (peopleNumber >= 100) {
                            price = (peopleNumber - 10) * 15.60;
                            break;
                        }
                        price = peopleNumber * 15.60;
                        break;
                    case "Regular":
                        price = peopleNumber * 20;
                        break;
                }
                break;
            case "Sunday":
                switch (group) {
                    case "Students":
                        price = peopleNumber * 10.46;
                        break;
                    case "Business":
                        if (peopleNumber >= 100) {
                            price = (peopleNumber - 10) * 16;
                            break;
                        }
                        price = peopleNumber * 16;
                        break;
                    case "Regular":
                        price = peopleNumber * 22.50;
                        break;
                }
                break;
        }
        if (group.equals("Students") && peopleNumber >= 30) {
            price = price * 0.85;
        } else if (group.equals("Regular") && peopleNumber >= 10 && peopleNumber <= 20) {
            price = price * 0.95;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
