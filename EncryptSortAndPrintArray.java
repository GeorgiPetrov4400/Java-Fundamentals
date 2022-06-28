package ArraysMoreExercise;

import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] name = scanner.nextLine().split("");
            int sum = 0;
            int arrayLength = name.length;
            for (int j = 0; j < name.length; j++) {
                int symbol = Integer.parseInt(name[j]);
                if (symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117) {
                    sum += symbol * arrayLength;
                } else {
                    sum += symbol / arrayLength;
                }
            }
        }
    }
}
