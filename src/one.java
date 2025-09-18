public class one {
    public static void main(String args[])
    {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                for(int k=1;k<=i;k++)
                {
                    System.out.println(j);
                }

            }
            System.out.println(-1);
        }
    }
}
