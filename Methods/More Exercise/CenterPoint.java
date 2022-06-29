package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X1 = Integer.parseInt(scanner.nextLine());
        int Y1 = Integer.parseInt(scanner.nextLine());
        int X2 = Integer.parseInt(scanner.nextLine());
        int Y2 = Integer.parseInt(scanner.nextLine());

        printClosestNum(X1, Y1, X2, Y2);

    }

    private static void printClosestNum(int x1, int y1, int x2, int y2) {
        int result1 = x1 * x1 + y1 * y1;
        int result2 = x2 * x2 + y2 * y2;
        if (result1 < result2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
