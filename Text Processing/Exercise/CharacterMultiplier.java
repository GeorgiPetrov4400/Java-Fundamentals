package TextProcessingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        char[] firstText = input[0].toCharArray();
        char[] secondText = input[1].toCharArray();

        int smallTextLength = Math.min(firstText.length, secondText.length);
        int bigTextLength = Math.max(firstText.length, secondText.length);

        int sum = 0;
        for (int i = 0; i < bigTextLength; i++) {
            if (i < smallTextLength) {
                sum += firstText[i] * secondText[i];
            } else if (firstText.length > secondText.length) {
                sum += firstText[i];
            } else {
                sum += secondText[i];
            }
        }
        System.out.println(sum);
    }
}
