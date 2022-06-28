package BasicSintaxConditionalStatementAndLoop;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        switch (dayType) {
            case "Weekday":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    ticketPrice = 12;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    ticketPrice = 18;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    ticketPrice = 12;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Weekend":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    ticketPrice = 15;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    ticketPrice = 20;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    ticketPrice = 15;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Holiday":
                if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                    ticketPrice = 5;
                } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                    ticketPrice = 12;
                } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                    ticketPrice = 10;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
        }
        System.out.printf("%d$", ticketPrice);
    }
}
