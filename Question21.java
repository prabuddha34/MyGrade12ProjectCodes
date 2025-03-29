import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        String sentence = "";
        String word = "";
        String reversedWord = "";
        String palindromeWords = "";
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        sentence = sc.nextLine().toLowerCase(); // Convert to lowercase for uniform comparison

        sentence = sentence + " "; // Add a trailing space to handle the last word
        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);

            if (ch == ' ') {
                // Check if the word is a palindrome
                if (word.equals(reversedWord)) {
                    palindromeWords += word + " ";
                    count++;
                }
                // Reset for the next word
                word = "";
                reversedWord = "";
            } else {
                word += ch;
                reversedWord = ch + reversedWord;
            }
        }

        // Output results
        if (count > 0) {
            System.out.println("Palindrome words in the sentence:");
            System.out.println(palindromeWords);
            System.out.println("NUMBER OF PALINDROMIC WORDS: " + count);
        } else {
            System.out.println("NO PALINDROMIC WORDS FOUND");
        }

        sc.close(); // Close the scanner
    }
}
