public class ispower {
    public static void main(String args[])
    {
        System.out.println(check(2,4));
    }
    public static boolean check(int x,int y)
    {
        if(y==1)
        {
            return true;
        }
        while(y%x==0)
        {
            y=y/x;
        }
        return y==1;
    }
}
