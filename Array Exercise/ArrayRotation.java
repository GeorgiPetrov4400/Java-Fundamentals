package ArrayExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialArray = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement = initialArray[0];
            for (int j = 0; j < initialArray.length - 1; j++) {
                initialArray[j] = initialArray[j + 1];
            }
            initialArray[initialArray.length - 1] = firstElement;
        }
        for (String number : initialArray) {
            System.out.print(number + " ");
        }
    }
}
