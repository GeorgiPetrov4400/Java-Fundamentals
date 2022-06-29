package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

       // System.out.println(getSumResult(firstNum, secondNum));
        System.out.println(getResult(firstNum, secondNum, thirdNum));
    }

    private static int getSumResult(int firstNum, int secondNum) {
        int sumResult = firstNum + secondNum;
        return sumResult;
    }

    private static int getResult(int firstNum, int secondNum, int thirdNum) {
        int getResult = (firstNum + secondNum) - thirdNum;
        return getResult;
    }
}
