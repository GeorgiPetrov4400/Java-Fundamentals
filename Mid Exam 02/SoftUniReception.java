package ProgrammingFundamentalsMidExam02;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int studentProblemPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int countWorkingHours = 0;

        while (studentsCount > 0) {
            countWorkingHours++;
            if (countWorkingHours % 4 != 0) {
                studentsCount -= studentProblemPerHour;
            }
        }

       /* while (true) {
            if (studentsCount <= 0) {
                break;
            }
            studentsCount -= studentProblemPerHour;
            countWorkingHours++;

            if (countWorkingHours % 4 == 0) {
                countWorkingHours++;
            }
        }*/
        System.out.printf("Time needed: %dh.", countWorkingHours);
    }
}
