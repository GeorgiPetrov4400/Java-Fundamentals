package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());

        double courses = Math.ceil(people / capacity);

        System.out.printf("%.0f", courses);
    }
}
