package MapsLambdaStreamAPIExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companyAndEmployeeInfo = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employeeID = data[1];
            if (companyAndEmployeeInfo.containsKey(companyName)) {
                if (companyAndEmployeeInfo.get(companyName).contains(employeeID)) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    companyAndEmployeeInfo.get(companyName).add(employeeID);
                }
            } else {
                companyAndEmployeeInfo.put(companyName, new ArrayList<>());
                companyAndEmployeeInfo.get(companyName).add(employeeID);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyAndEmployeeInfo.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            String keyValue = entry.getKey();
            for (String id : companyAndEmployeeInfo.get(keyValue)) {
                System.out.printf("-- %s%n", id);
            }
        }
    }
}
