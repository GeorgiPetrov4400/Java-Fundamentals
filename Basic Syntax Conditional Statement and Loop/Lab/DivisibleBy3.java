package BasicSintaxConditionalStatementAndLoop;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {

        for (int i = 3; i <= 100; i += 3) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
