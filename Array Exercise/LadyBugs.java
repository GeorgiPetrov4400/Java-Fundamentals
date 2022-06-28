package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialBugPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];

        for (int i = 0; i < initialBugPosition.length; i++) {
            int index = initialBugPosition[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            int firstPosition = Integer.parseInt(command[0]);
            String direction = command[1];
            int nextPosition = Integer.parseInt(command[2]);

            if (firstPosition < 0 || firstPosition >= field.length || field[firstPosition] != 1) {
                input = scanner.nextLine();
                continue;
            }
            field[firstPosition] = 0;
            switch (direction) {
                case "right":
                    firstPosition += nextPosition;
                    while (firstPosition < fieldSize && field[firstPosition] == 1) {
                        firstPosition += nextPosition;
                    }
                    if (firstPosition < fieldSize) {
                        field[firstPosition] = 1;
                    }
                    break;
                case "left":
                    firstPosition -= nextPosition;
                    while (firstPosition >= 0 && field[firstPosition] == 1) {
                        firstPosition -= nextPosition;
                    }
                    if (firstPosition >= 0) {
                        field[firstPosition] = 1;
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        Arrays.stream(field).forEach(e -> System.out.print(e + " "));
    }
}
