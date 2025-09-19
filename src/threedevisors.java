import java.util.Scanner;

public class threedevisors {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            int n=sc.nextInt();
            System.out.println(find(n));
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int find(int n)
    {
        int limit=(int) Math.sqrt(n);
        int count=1;
        for(int i=2;i<=limit;i++)
        {
            if(isPrime(i))
            {
                if(i*i<=n)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
