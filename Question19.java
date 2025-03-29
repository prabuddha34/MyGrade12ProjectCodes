import java.util.Scanner;
class Question19{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n = ");
        int n = Integer.parseInt(in.nextLine());
        if(m >= n){
            System.out.println("INVALID INPUT");
            return;
        }
        int count = 0;
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE:");
        for(int i = m; i <= n; i++){
            if(isComposite(i) && isMagic(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.print("NIL");
        System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS: " + count);
    }
    public static boolean isComposite(int n){
        if(n <= 3)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return true;
        }
        return false;
    }
    public static boolean isMagic(int n){
        while(n > 9){
            int sum = 0;
            for(int i = n; i > 0; i /= 10)
                sum += i % 10;
            n = sum;
        }
        return n == 1;
    }
}