package BasicSintaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalSaberPrice = saberPrice * Math.ceil(studentsCount * 1.10);
        double totalRobePrice = robePrice * studentsCount;
        int freeBelt = studentsCount / 6;
        double totalBeltPrice = beltPrice * (studentsCount - freeBelt);
        double sumEquipment = totalSaberPrice + totalRobePrice + totalBeltPrice;

        if (sumEquipment <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", sumEquipment);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sumEquipment - amountMoney);
        }
    }
}
