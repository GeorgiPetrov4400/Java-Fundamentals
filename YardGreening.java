import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        //1. Цена кв/м - 7.61лв
        //2. 18% отстъпка от цената
        //3. Квадратни метри за озеленяване
        Scanner scanner = new Scanner(System.in);
        double squareMeter = Double.parseDouble(scanner.nextLine());
        double price = squareMeter * 7.61;
        double discount = price * 0.18;
        double realPrice = price - discount;
        System.out.println("The final price is " + realPrice + " lv");
        System.out.println("The discount is " + discount + " lv");


    }
}
