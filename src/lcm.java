public class lcm {
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b)
    {
        return a*b/gcd(a,b);
    }
    public static void main(String args[])
    {
        int a=20;
        int b=40;
        System.out.println("lcm is:"+lcm(a,b));
    }
}
