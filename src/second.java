import java.util.Arrays;

public class second {
    public static int[] generate(int n)
    {
        int table[] =new int[n];
        for(int i=0;i<n;i++)
        {
            table[i]=n*(i+1);
        }
        return table;
    }
    public static void main(String args[])
    {
        int n=9;
        int result[] =generate(n);
        System.out.println(Arrays.toString(result));
    }
}
