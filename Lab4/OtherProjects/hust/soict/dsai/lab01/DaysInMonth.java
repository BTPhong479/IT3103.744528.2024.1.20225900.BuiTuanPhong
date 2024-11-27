import java.util.Scanner;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class DaysInMonth {
    private static final Map<String, Integer> monthMap = new HashMap<>();

    static {
        monthMap.put("January", 1);
        monthMap.put("Jan.", 1);
        monthMap.put("Jan", 1);
        monthMap.put("1", 1);
        monthMap.put("February", 2);
        monthMap.put("Feb.", 2);
        monthMap.put("Feb", 2);
        monthMap.put("2", 2);
        monthMap.put("March", 3);
        monthMap.put("Mar.", 3);
        monthMap.put("Mar", 3);
        monthMap.put("3", 3);
        monthMap.put("April", 4);
        monthMap.put("Apr.", 4);
        monthMap.put("Apr", 4);
        monthMap.put("4", 4);
        monthMap.put("May", 5);
        monthMap.put("5", 5);
        monthMap.put("June", 6);
        monthMap.put("Jun.", 6);
        monthMap.put("Jun", 6);
        monthMap.put("6", 6);
        monthMap.put("July", 7);
        monthMap.put("Jul.", 7);
        monthMap.put("Jul", 7);
        monthMap.put("7", 7);
        monthMap.put("August", 8);
        monthMap.put("Aug.", 8);
        monthMap.put("Aug", 8);
        monthMap.put("8", 8);
        monthMap.put("September", 9);
        monthMap.put("Sep.", 9);
        monthMap.put("Sep", 9);
        monthMap.put("9", 9);
        monthMap.put("October", 10);
        monthMap.put("Oct.", 10);
        monthMap.put("Oct", 10);
        monthMap.put("10", 10);
        monthMap.put("November", 11);
        monthMap.put("Nov.", 11);
        monthMap.put("Nov", 11);
        monthMap.put("11", 11);
        monthMap.put("December", 12);
        monthMap.put("Dec.", 12);
        monthMap.put("Dec", 12);
        monthMap.put("12", 12);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = scanner.nextLine();
            if (monthMap.containsKey(monthInput)) {
                month = monthMap.get(monthInput);
            } else {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine();
            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Invalid year. Please enter a non-negative number.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter a valid number.");
                continue;
            }

            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println("Number of days: " + daysInMonth);
            break;
        }

        scanner.close();
    }
}
