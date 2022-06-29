package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int index = Integer.parseInt(scanner.nextLine());

        int sumRemovedElement = 0;
        int removedElement = 0;
        while (sequence.size() > 0) {
            if (index < 0) {
                index = 0;
                removedElement = sequence.get(index);
                sequence.add(0, sequence.get(sequence.size() - 1));
                sequence.remove(1);
            } else if (index > sequence.size() - 1) {
                index = sequence.size() - 1;
                removedElement = sequence.get(index);
                sequence.add(sequence.size() - 1, sequence.get(0));
                sequence.remove(sequence.size() - 1);
            } else  {
                removedElement = sequence.get(index);
                sequence.remove(index);
            }

            int size = sequence.size();
            int count = 0;
            for (int i = 0; i < size; i++) {
                count++;
                if (sequence.get(i) <= removedElement) {
                    sequence.add(sequence.get(i) + removedElement);
                    sequence.remove(sequence.get(i));
                    i--;
                    if (count == size) {
                        break;
                    }
                } else {
                    sequence.add(sequence.get(i) - removedElement);
                    sequence.remove(sequence.get(i));
                    i--;
                    if (count == size) {
                        break;
                    }
                }
            }
            sumRemovedElement += removedElement;
            if (size == 0) {
                break;
            }

            index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumRemovedElement);
    }
}
