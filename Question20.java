import java.util.Scanner;

public class Question20 {

    // Method to check if the input is a valid ISBN
    public static boolean isValidISBN(String isbn) {
        if (isbn.length() != 10) {
            return false; // ISBN must be exactly 10 digits long
        }

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            char ch = isbn.charAt(i);
            if (ch < '0' || ch > '9') {
                return false; // All characters except the last one must be digits
            }
            int digit = ch - '0';
            sum += (10 - i) * digit;
        }

        char lastChar = isbn.charAt(9);
        if (lastChar == 'X') {
            sum += 10;
        } else if (lastChar >= '0' && lastChar <= '9') {
            sum += (lastChar - '0');
        } else {
            return false; // Last character must be a digit or 'X'
        }

        return sum % 11 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 10-digit ISBN code: ");
        String isbn = scanner.nextLine().trim();

        if (isbn.length() != 10) {
            System.out.println("Invalid input. ISBN must be exactly 10 characters long.");
        } else if (isValidISBN(isbn)) {
            System.out.println(isbn + " is a valid ISBN.");
        } else {
            System.out.println(isbn + " is not a valid ISBN.");
        }

    }
}

