package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String regexBarcode = "(@{1}#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@{1}#+)";
            String regexGroup = "[0-9]+";
            String input = scanner.nextLine();

            Pattern patternBarcode = Pattern.compile(regexBarcode);
            Pattern patternGroup = Pattern.compile(regexGroup);
            Matcher matcherBarcode = patternBarcode.matcher(input);
            Matcher matcherGroup = patternGroup.matcher(input);

            if (matcherBarcode.find()) {
                StringBuilder numbers = new StringBuilder();
                while (matcherGroup.find()) {
                    numbers.append(matcherGroup.group());
                }
                if (numbers.toString().isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", numbers);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
