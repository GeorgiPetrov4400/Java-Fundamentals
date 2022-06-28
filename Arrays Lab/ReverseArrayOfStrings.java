package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayString = scanner.nextLine().split(" ");

        for (int i = 0; i < arrayString.length / 2; i++) {
            String oldElement = arrayString[i];
            arrayString[i] = arrayString[arrayString.length - 1 - i];
            arrayString[arrayString.length - 1 - i] = oldElement;
        }
        //System.out.println(String.join(" ", arrayString));
        for (String s : arrayString) {
            System.out.print(s + " ");
        }
    }
}
