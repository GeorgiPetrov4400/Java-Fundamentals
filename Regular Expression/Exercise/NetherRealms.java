package RegularExpressionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("[\\s]*[,][\\s]*");
        for (String input : line) {
            String regexHealth = "[^0-9+*/.-]";
            Pattern patternHealth = Pattern.compile(regexHealth);
            Matcher matcherHealth = patternHealth.matcher(input);

            int health = 0;
            while (matcherHealth.find()) {
                char symbol = matcherHealth.group().charAt(0);
                health += symbol;
            }

            String regexDamage = "[-|+]?(\\d+\\.?\\d+|\\d+)";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(input);

            double damage = 0.0;
            while (matcherDamage.find()) {
                double number = Double.parseDouble(matcherDamage.group());
                damage += number;
            }
            if (damage > 0) {
                String regexSymbol = "[*/]";
                Pattern patternSymbol = Pattern.compile(regexSymbol);
                Matcher matcherSymbol = patternSymbol.matcher(input);

                while (matcherSymbol.find()) {
                    String symbol = matcherSymbol.group();
                    if (symbol.equals("*")) {
                        damage *= 2;
                    } else if (symbol.equals("/")) {
                        damage /= 2;
                    }
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", input, health, damage);
        }
    }
}
