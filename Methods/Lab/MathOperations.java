package MethodsLab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNum = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("#.##").format(getResult(firstNum, operator, secondNum)));
    }

    private static double getResult(double firstNum, char symbol, double secondNum) {
        switch (symbol) {
            case '/':
                return firstNum / secondNum;
            case '*':
                return firstNum * secondNum;
            case '+':
                return firstNum + secondNum;
        }
        return firstNum - secondNum;
    }
}
