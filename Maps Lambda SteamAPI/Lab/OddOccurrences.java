package MapsLambdaStreamAPILab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequence = scanner.nextLine().split(" ");

        Map<String, Integer> sequenceCountMap = new LinkedHashMap<>();

        for (int i = 0; i < sequence.length; i++) {
            String word = sequence[i].toLowerCase();
            if (sequenceCountMap.containsKey(word)) {
                sequenceCountMap.put(word, sequenceCountMap.get(word) + 1);
            } else {
                sequenceCountMap.put(word, 1);
            }
        }

        List<String> oddValues = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : sequenceCountMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddValues.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ", oddValues));

        /*int count = 0;
        for (Map.Entry<String, Integer> entry : sequenceCountMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            } else {
                count++;
                continue;
            }
            System.out.print(entry.getKey());
            if (count == sequenceCountMap.size()) {
                break;
            }
            System.out.print(", ");
        }*/
    }
}
