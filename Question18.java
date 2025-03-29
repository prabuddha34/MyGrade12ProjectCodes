import java.util.Scanner;

public class Question18 {

    // Method to check if a number is a fascinating number
    public static boolean isFascinating(int num) {
        if (num < 100) {
            return false;
        }

        // Calculate num * 2 and num * 3
        int num2 = num * 2;
        int num3 = num * 3;

        // Concatenate num, num2, and num3
        String concatenated = num + "" + num2 + "" + num3;

        // Remove all '0' characters from the concatenated string
        concatenated = concatenated.replace("0", "");

        // Check if concatenated string contains all digits from 1 to 9 exactly once
        if (concatenated.length() != 9) {
            return false; // Should be exactly 9 characters long
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (concatenated.indexOf(digit) == -1 || concatenated.lastIndexOf(digit) != concatenated.indexOf(digit)) {
                return false; // Each digit from 1 to 9 must appear exactly once
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take range input from the user
        System.out.print("Enter the start of the range (m): ");
        int m = in.nextInt();
        System.out.print("Enter the end of the range (n): ");
        int n = in.nextInt();

        // Validate the input range
        if (m < 100 || n < 100 || m >= n || n > 9999) {
            System.out.println("Invalid input. Ensure 100 <= m < n <= 9999.");
            return;
        }

        boolean fascinating = false;

        // Check each number in the range
        System.out.println("Fascinating Numbers in the range:");
        int c=0;
        for (int num = m; num <= n; num++) {
            if (isFascinating(num)) {
                System.out.println("Number: " + num + " ");
                fascinating = true;
                c++;
            }
        }
        System.out.println("The Frequency Of The Fascinating Numbers Are"+" "+c);

        if (!fascinating) {
            System.out.println("No Fascinating Numbers found in the given range.");
        }

        in.close();
    }
}

