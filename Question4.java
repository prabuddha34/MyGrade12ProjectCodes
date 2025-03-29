import java.util.Scanner;
public class Question4{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);         System.out.println("Enter n");
        int N= sc.nextInt();// Example size, can be changed as needed
        int[][] matrix = new int[N][N];
        fillSpiralMatrix(matrix);
        printMatrix(matrix);
    }

    public static void fillSpiralMatrix(int[][] matrix) {
        int N = matrix.length;
        int num = 1;
        int top = 0, bottom = N - 1, left = 0, right = N - 1;

        while (num <= N * N) {
            // Fill the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Fill the bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Fill the left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
