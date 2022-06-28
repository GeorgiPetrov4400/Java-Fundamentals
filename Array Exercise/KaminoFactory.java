package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfDNA = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int bestSequenceIndex = 0;
        int bestLength = 1;
        int bestStartingIndex = 0;
        int bestSum = 0;
        int[] bestArray = new int[lengthOfDNA];

        while (!input.equals("Clone them!")) {
            int currentSequenceSum = 0;
            int currentLength = 1;
            int bestCurrentLength = 1;
            int currentStartingIndex = 0;
            counter++;

            int[] currentSequence = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < currentSequence.length - 1; i++) {
                if (currentSequence[i] == currentSequence[i + 1]) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }

                if (currentLength > bestCurrentLength) {
                    currentStartingIndex = i;
                    bestCurrentLength = currentLength;
                }
                currentSequenceSum += currentSequence[i];
            }
            currentSequenceSum += currentSequence[currentSequence.length - 1];

            if (bestCurrentLength > bestLength) {
                bestLength = bestCurrentLength;
                bestArray = Arrays.stream(currentSequence).toArray();
                bestStartingIndex = currentStartingIndex;
                bestSequenceIndex = counter;
                bestSum = currentSequenceSum;

            } else if (bestCurrentLength == bestLength) {
                if (currentStartingIndex < bestStartingIndex) {
                    bestArray = Arrays.stream(currentSequence).toArray();
                    bestStartingIndex = currentStartingIndex;
                    bestSequenceIndex = counter;
                    bestSum = currentSequenceSum;
                } else if (currentSequenceSum > bestSum) {
                    bestArray = Arrays.stream(currentSequence).toArray();
                    bestStartingIndex = currentStartingIndex;
                    bestSequenceIndex = counter;
                    bestSum = currentSequenceSum;
                }
            }
            input = scanner.nextLine();

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSum);
        for (int e : bestArray) {
            System.out.print(e + " ");

        }
    }
}
