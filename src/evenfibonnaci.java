public class evenfibonnaci {
    public static int find(int n)
    {
        int a=0;
        int b=1;
        int next;
        int count=0;
        while(true)
        {
            next=a+b;
            a=b;
            b=next;

            if(next%2==0)
            {
                count++;
                if(next==n)
                {
                    return next;
                }
            }
        }
    }

    public static void main(String args[])
    {
        int n=2;
        System.out.println(find(n));
    }
}
