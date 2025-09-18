public class primenobetweenintervals {
    public static boolean check(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[])
    {
          int n=20;
          int sum=0;
          for(int i=2;i<=n;i++)
          {
              if(check(i))
              {
                  sum=sum+i;
              }
          }
          System.out.println("sum is:"+sum);
    }
}
