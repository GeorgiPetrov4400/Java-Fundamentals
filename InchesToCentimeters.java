import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        //1. инчове дроби
        //2. изчисляваме см: инчове * 2,54
        //3. отпечатваме
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);

    }
}
