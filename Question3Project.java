import java.util.Scanner;

public class Question3Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the date in DDMMYY format
        System.out.print("Enter the date in DDMMYY format (e.g., 141296): ");
        String dateInput = scanner.nextLine();

        // Validate the length of the input
        if (dateInput.length() != 6) {
            System.out.println("Invalid Date");
            scanner.close();
            return;
        }

        // Extract day, month, and year from the input
        int day = 0, month = 0, year = 0;
        try {
            day = Integer.parseInt(dateInput.substring(0, 2));
            month = Integer.parseInt(dateInput.substring(2, 4));
            year = Integer.parseInt(dateInput.substring(4, 6));
        } catch (NumberFormatException e) {
            System.out.println("Invalid Date");
            scanner.close();
            return;
        }

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid Date");
            scanner.close();
            return;
        }

        // Validate day based on the month
        boolean ValidDate = true;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 1 || day > 31) ValidDate = false;
                break;
            case 4: case 6: case 9: case 11:
                if (day < 1 || day > 30) ValidDate = false;
                break;
            case 2:
                // Check for leap year
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear) {
                    if (day < 1 || day > 29) ValidDate = false;
                } else {
                    if (day < 1 || day > 28) ValidDate = false;
                }
                break;
            default:
                ValidDate = false;
                break;
        }

        if (!ValidDate) {
            System.out.println("Invalid Date");
        } else {
            // Format the date for output
            String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            String suffix;
            if (day % 10 == 1 && day != 11) {
                suffix = "st";
            } else if (day % 10 == 2 && day != 12) {
                suffix = "nd";
            } else if (day % 10 == 3 && day != 13) {
                suffix = "rd";
            } else {
                suffix = "th";
            }
            System.out.printf("%d%s %s, %02d%n", day, suffix, monthNames[month], year);
        }
    }
}
