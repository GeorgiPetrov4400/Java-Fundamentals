package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("#.######").format(getResult(number, power)));
    }

    private static double getResult(double num, int pow) {
        double result = Math.pow(num, pow);
        return result;
    }
}
