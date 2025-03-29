import java.util.Scanner;
public class Question22
{
    public static boolean isPrime(int n)
    {
        int c = 0,i=0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                c++;
            }

        }
        if(c > 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean isPalindrome(int n)
    {
        int rev = 0,temp=0;
        temp=n;
        while(temp>0)
        {
            rev = rev * 10 + temp % 10;
            temp=temp/10;
        }
        if(rev==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        int i=0,m=0,n=0,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("m = ");
        m =sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();
        if(m > 3000 || n > 3000 || m > n)
        {
            System.out.println("OUT OF RANGE.");
            return;
        }
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for(i = m; i <= n; i++)
        {
            if(isPalindrome(i) && isPrime(i))
            {
                if(count == 0)
                    System.out.print(i);
                else
                {
                    System.out.print(", " + i);
                }
                count++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS: " + count);
    }
}