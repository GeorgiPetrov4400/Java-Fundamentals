package ArraysLab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int[] firstArray = new int[input.length];
        int[] secondArray = new int[input2.length];

        int countIndex = 0;
        if (firstArray.length != secondArray.length) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", countIndex);
        }

        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(input[i]);
            secondArray[i] = Integer.parseInt(input2[i]);

            if (firstArray[i] == secondArray[i]) {
                countIndex++;
                sum += firstArray[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", countIndex);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}

