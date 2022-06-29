package MapsLambdaStreamAPIExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseAndStudentInfo = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String courseName = data[0];
            String studentName = data[1];
            if (courseAndStudentInfo.containsKey(courseName)) {
                courseAndStudentInfo.get(courseName).add(studentName);
            } else {
                courseAndStudentInfo.put(courseName, new ArrayList<>());
                courseAndStudentInfo.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseAndStudentInfo.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            String keyValue = entry.getKey();
            for (String value : courseAndStudentInfo.get(keyValue)) {
                System.out.printf("-- %s%n", value);
            }
        }
    }
}

