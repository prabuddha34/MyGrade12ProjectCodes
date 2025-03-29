import java.util.Scanner;

public class Question24{

    public static void main(String[] args) {
        int p, q;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter p and q:");
        p = scanner.nextInt();
        q = scanner.nextInt();
        
        if (p < 1 || q >= 5000 || p > q) {
            System.out.println("Invalid input. Ensure that 1 <= p < q < 5000.");
            scanner.close();
            return;
        }

        int count;
        int flag = 0;
        
        System.out.println("Kaprekar numbers are:");
        
        for (int h = p; h <= q; h++) {
            int y = h;
            count = 0;
            
            // Count the number of digits in the number
            while (y != 0) {
                ++count;
                y /= 10;
            }
            
            int w = h * h;
            int rightPart = w % (int) Math.pow(10, count);
            int leftPart = w / (int) Math.pow(10, count);
            
            if ((rightPart + leftPart) == h) {
                System.out.println(h);
                ++flag;
            }
        }
        
        System.out.println("Frequency: " + flag);
        scanner.close();
    }
}
