public class npr {
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
         fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n=5;
        int r=2;
        if(n<r)
        {
            System.out.println("invalid not posible");
        }
        else
        {
           int result= fact(n)/fact(n-r);
           System.out.println(result);
        }
    }
}
