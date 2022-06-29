package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int length = numbers.size();
        for (int i = 0; i < length / 2; i++) {
            int firstElement = numbers.get(i);
            int secondElement = numbers.get(numbers.size() - 1);
            numbers.set(i, firstElement + secondElement);
            numbers.remove(numbers.size() - 1);
            //numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            //numbers.remove(numbers.size() - 1);
        }
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
