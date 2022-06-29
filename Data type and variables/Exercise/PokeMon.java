package DataTypesAndVariablesExercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int initialN = N;
        while (!(N < M)) {
            N -= M;
            count++;
            if (N == initialN * 0.50 && Y != 0) {
                N = N / Y;
            }
            if (N < M) {
                System.out.println(N);
                System.out.println(count);
                break;
            }
        }
    }
}
