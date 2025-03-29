import java.util.Scanner;

public class Question23 {

    // Method to convert numbers from 1 to 19 into words
    public static String oneToNineteen(int num) {
        String[] words = {
            "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
            "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
        };
        return words[num];
    }

    // Method to convert multiples of ten from 20 to 90 into words
    public static String tens(int num) {
        String[] words = {
            "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
        };
        return words[num / 10];
    }

    // Method to convert numbers from 1 to 99 into words
    public static String twoDigits(int num) {
        if (num < 20) {
            return oneToNineteen(num);
        } else {
            int ten = num / 10;
            int one = num % 10;
            return tens(ten) + (one != 0 ? " " + oneToNineteen(one) : "");
        }
    }

    // Method to convert numbers from 100 to 999 into words
    public static String threeDigits(int num) {
        int hundred = num / 100;
        int remainder = num % 100;
        if (remainder == 0) {
            return oneToNineteen(hundred) + " HUNDRED";
        } else {
            return oneToNineteen(hundred) + " HUNDRED " + twoDigits(remainder);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number less than 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number >= 1000) {
            System.out.println("OUT OF RANGE");
        } else if (number < 100) {
            System.out.println(twoDigits(number));
        } else {
            System.out.println(threeDigits(number));
        }
    }
}

