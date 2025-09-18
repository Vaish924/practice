import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//program to find array leader
public class eleven {
    public static List<Integer> find(int arr[])
    {
        List<Integer> s=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        s.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                s.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(s);
        return s;

    }
    public static void main(String args[])
    {
        int arr[]={4,8,6,7,5,4};
        System.out.println(find(arr));
    }

}
