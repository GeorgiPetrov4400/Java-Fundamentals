package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber == 1) {
            System.out.println(daysOfWeek[0]);
        } else if (dayNumber == 2) {
            System.out.println(daysOfWeek[1]);
        } else if (dayNumber == 3) {
            System.out.println(daysOfWeek[2]);
        } else if (dayNumber == 4) {
            System.out.println(daysOfWeek[3]);
        } else if (dayNumber == 5) {
            System.out.println(daysOfWeek[4]);
        } else if (dayNumber == 6) {
            System.out.println(daysOfWeek[5]);
        } else if (dayNumber == 7) {
            System.out.println(daysOfWeek[6]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
