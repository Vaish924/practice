public class kthdigitfrompower {
    public static void main(String args[])
    {
        int a=3;
        int b=3;
        int k=2;
        int result=1;
        for(int i=0;i<b;i++)
        {
            result=result*a;
        }
        int temp=result;
        int solution=-1;
        for(int i=1;i<=k;i++)
        {
         solution=temp%10;
         temp=temp/10;
        }
        System.out.println("a raise to b is:" +result);
        System.out.println("kth digit is:"+solution);
    }
}
