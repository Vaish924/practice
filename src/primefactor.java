public class primefactor {
    public static void main(String args[])
    {
        int n=20;
        int largest=1;
        for(int i=2;i<n/2;i++)
        {
            while(n%i==0)
            {
                largest=i;
                n=n/i;
            }
        }
        System.out.println("largest is:"+largest);
    }
}
