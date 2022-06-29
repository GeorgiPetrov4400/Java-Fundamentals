package MapsLambdaStreamAPILab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countNum = new TreeMap<>();

        for (double num : numbers) {
            if (countNum.containsKey(num)) {
                countNum.put(num, countNum.get(num) + 1);
            } else {
                countNum.put(num, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNum.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
