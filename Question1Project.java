import java.util.Scanner;

public class Question1Project{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validation for M
        System.out.print("Enter the value for M (100 <= M <= 10000): ");
        int M = scanner.nextInt();
        if (M < 100 || M > 10000) {
            System.out.println("Invalid input for M. It should be between 100 and 10000.");
            return;
        }

        // Input and validation for N
        System.out.print("Enter the value for N (0 <= N < 100): ");
        int N = scanner.nextInt();
        if (N < 0 || N >= 100) {
            System.out.println("Invalid input for N. It should be between 0 and 99.");
            return;
        }

        // Finding the smallest integer greater than M whose digits add up to N
        int candidate = M + 1;
        while (true) {
            // Calculate the sum of digits of the candidate number
            int sum = 0;
            int temp = candidate;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // Check if the sum of digits equals N
            if (sum == N) {
                // Output the result
                System.out.println("The smallest integer greater than " + M + " whose digits add up to " + N + " is: " + candidate);
                System.out.println("Total number of digits present in the required number: " + String.valueOf(candidate).length());
                break;
            }

            // Increment candidate to check the next number
            candidate++;
        }
    }
}
