import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        //1. Храна за кучета 2,50лв
        //2. Храна за котки 4.00лв
        //3. Крайна сума в lv
        Scanner scanner = new Scanner(System.in);
        int dogFoodBag = Integer.parseInt(scanner.nextLine());
        double dogFood = dogFoodBag * 2.50;
        int catFoodBag = Integer.parseInt(scanner.nextLine());
        int catFood = catFoodBag * 4;
        System.out.println(dogFood + catFood  + " lv");



    }
}
