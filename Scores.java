import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of participants
        System.out.println("Enter the number of participants: ");
        int n = sc.nextInt();

        // Array to store answers of participants
        int[][] arr = new int[n][5];
        
        // Array to store correct key answers
        int[] key = new int[5];

        // Input the correct answers
        System.out.println("Enter the correct answers (key): ");
        for (int i = 0; i < 5; i++) {
            key[i] = sc.nextInt();
        }

        // Input answers from participants
        System.out.println("Enter the answers of the participants: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Participant " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int score = 0;
        int hscore = 0;

        System.out.println("SCORES OF THE PARTICIPANTS");
        for (int i = 0; i < n; i++) {
            score = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == key[j]) {
                    score++;
                }
            }
            System.out.println("PARTICIPANT " + (i + 1) + ": " + score);
            if (score > hscore) {
                hscore = score;
                System.out.println("Highest Scorer: Participant " + (i + 1));
            }
        }
    }
}

