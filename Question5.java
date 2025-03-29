import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the size of the matrix
        System.out.print("Enter the size of the matrix (M) where 2 < M < 10: ");
        int M = scanner.nextInt();

        // Validate the size of the matrix
        if (M <= 2 || M >= 10) {
            System.out.println("Invalid input. M must be greater than 2 and less than 10.");
            scanner.close();
            return;
        }

        // Initialize the matrix
        int[][] matrix = new int[M][M];

        // Input values into the matrix
        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Rotate the matrix 90 degrees clockwise
        int[][] rotated = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                rotated[j][M - 1 - i] = matrix[i][j];
            }
        }

        // Display the rotated matrix
        System.out.println("Rotated matrix (90 degrees clockwise):");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

        // Find the sum of the elements at the four corners
        int cornerSum = matrix[0][0] + matrix[0][M - 1] + matrix[M - 1][0] + matrix[M - 1][M - 1];
        System.out.println("Sum of the elements at the four corners: " + cornerSum);

        // Close the scanner
        scanner.close();
    }
}

