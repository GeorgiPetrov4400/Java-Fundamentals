package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        //OutFall 4	                    $39.99
        //CS: OG	                    $15.99
        //Zplinter Zell	                $19.99
        //Honored 2	                    $59.99
        //RoverWatch	                $29.99
        //RoverWatch Origins Edition	$39.99
        String input = scanner.nextLine();

        double price = 0.0;
        double sumPrice = 0.0;
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println("Bought OutFall 4");
                    break;
                case "CS: OG":
                    price = 15.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println(" Bought CS: OG");
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println("Bought Zplinter Zell");
                    break;
                case "Honored 2":
                    price = 59.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println("Bought Honored 2");
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println("Bought RoverWatch");
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if ((currentBalance - sumPrice) < price) {
                        System.out.println("Too Expensive");
                        break;
                    }
                    sumPrice += price;
                    System.out.println("Bought RoverWatch Origins Edition");
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (sumPrice >= currentBalance) {
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }
        if (currentBalance >= sumPrice) {
            System.out.printf("Total spent: $%.2f. ", sumPrice);
            System.out.printf("Remaining: $%.2f", currentBalance - sumPrice);
        }
    }
}
