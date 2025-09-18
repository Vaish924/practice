public class third {
    public static int find(int a1,int a2,int n)
    {
        int d=a2-a1;
        return a1+(n-1)*d;
    }
    public static void main(String args[])
    {
        int a1=2;
        int a2=4;
        int n=5;
        int result=find(a1,a2,n);
        System.out.println(result);
    }
}
