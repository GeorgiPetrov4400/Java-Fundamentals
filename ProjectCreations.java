import java.util.Scanner;

public class ProjectCreations {
    public static void main(String[] args) {
        //1. Име на архитект текст
        //2. Брой проекти които трябва да изготви - цяло число
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int hours = project * 3;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + project + " project/s.");

    }
}
