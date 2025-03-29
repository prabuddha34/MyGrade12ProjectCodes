import java.util.Scanner;

public class SimpleVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.println("Enter a sentence ending with '.', '?', or '!' :");
        String sentence = scanner.nextLine().trim();
        scanner.close();
        
        // Validate the input
        if (!sentence.endsWith(".") && !sentence.endsWith("?") && !sentence.endsWith("!")) {
            System.out.println("Sentence must end with '.', '?', or '!'");
            return;
        }
        
        // Remove the punctuation mark at the end
        sentence = sentence.substring(0, sentence.length() - 1).trim();
        
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");
        
        // Arrays to hold words
        String[] vowelWords = new String[words.length];
        String[] otherWords = new String[words.length];
        
        int vowelCount = 0;
        int otherCount = 0;
        
        // Define vowels
        String vowels = "AEIOU";
        
        // Process each word
        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                
                // Check if the word begins and ends with a vowel
                if (vowels.indexOf(firstChar) != -1 && vowels.indexOf(lastChar) != -1) {
                    vowelWords[vowelCount++] = word;
                } else {
                    otherWords[otherCount++] = word;
                }
            }
        }
        
        // Output the results
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + vowelCount);
        
        // Print words beginning and ending with a vowel
        for (int i = 0; i < vowelCount; i++) {
            System.out.print(vowelWords[i] + " ");
        }
        
        // Print remaining words
        for (int i = 0; i < otherCount; i++) {
            System.out.print(otherWords[i] + " ");
        }
    }
}