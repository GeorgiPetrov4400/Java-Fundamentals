package ProgrammingFundamentalsMidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        int countNumbers = 0;
        for (int i = 0; i < numbers.size(); i++) {
            countNumbers++;
            sum += numbers.get(i);
        }
        int difference = 0;
        int result = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (countNumbers == 1) {
                System.out.println("No");
                break;
            }
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                result = numbers.get(i) - numbers.get(i + 1);
            } else {
                difference++;
            }

        }
        if (result == 0 && difference == 0) {
            System.out.println("No");
        }
        double averageNum = sum * 1.0 / countNumbers;

        List<Integer> greaterNumber = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > averageNum) {
                greaterNumber.add(number);
            }
        }

        Collections.sort(greaterNumber);
        Collections.reverse(greaterNumber);

        int count = 5;
        for (Integer num : greaterNumber) {
            count--;
            if (count < 0) {
                break;
            }
            System.out.print(num + " ");
        }
    }
}
