package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> specialBombNumber = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < sequenceNumbers.size(); i++) {
            if (specialBombNumber.get(0) == sequenceNumbers.get(i)) {
                for (int j = specialBombNumber.get(1); j > 0; j--) {
                    if (i <= 0) {
                        break;
                    } else {
                        sequenceNumbers.remove(i - 1);
                        i--;
                    }
                }
                sequenceNumbers.remove(specialBombNumber.get(0));
                for (int j = 0; j < specialBombNumber.get(1); j++) {
                    if (i > sequenceNumbers.size() - 1) {
                        break;
                    } else {
                        sequenceNumbers.remove(i);
                    }
                }
                i--;
            }
        }
        int sum = 0;
        for (Integer number : sequenceNumbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
