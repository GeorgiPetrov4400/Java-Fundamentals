package ArrayExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                String text = secondArray[i];
                String text2 = firstArray[j];
                if (text.equals(text2)) {
                    System.out.print(text + " ");
                    break;
                }
            }
        }
    }
}
