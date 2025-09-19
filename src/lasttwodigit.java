public class lasttwodigit {
    public static void main(String args[])
    {
           int n=20;
           System.out.println(find(n));
    }
    public static int find(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=(a+b)%100;
            a=b;
            b=c;
        }
        return c;
    }
}
