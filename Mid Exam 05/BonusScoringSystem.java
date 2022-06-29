package ProgrammingFundamentalsMidExam05;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

        int maxLecture = 0;
        double maxBonus = 0;
        for (int i = 1; i <= studentsNumber; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            double bonus = studentAttendance * 1.0 / numberOfLectures * (5 + additionalBonus);
            if (bonus > maxBonus) {
                maxLecture = studentAttendance;
                maxBonus = bonus;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxLecture);
    }
}
