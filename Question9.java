import java.util.Scanner;
public class Question9
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of boxes (N): ");
        int n = in.nextInt();
        
        if (n < 1 || n > 1000) {
            System.out.println("INVALID INPUT");
            return;
        }

        int cartonSizes[] = {48, 24, 12, 6};

        int total = 0;
        int t = n;
        for (int i = 0; i < cartonSizes.length; i++) {
            int cartonCount = t / cartonSizes[i];
            t = t % cartonSizes[i];
            total += cartonCount;
            if (cartonCount != 0) {
                System.out.println(cartonSizes[i] + " * " + cartonCount + 
                    " = " + (cartonSizes[i] * cartonCount));
            }
        }

        /*
         * This if check is for the case when
         * boxes left are less than 6. We need
         * one more carton of capacity 6 in this
         * case so total is incremented by 1.
         */
        if (t != 0) {
            System.out.println("Remaining boxes = " + t 
                + " * 1 = " + t);
            total++;
        }
        else {
            System.out.println("Remaining boxes = 0");
        }

        System.out.println("Total number of boxes = " + n);
        System.out.println("Total number of cartons = " + total);
    }
}

