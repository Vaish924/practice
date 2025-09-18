import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class six {
    public static List<Integer> reverse(int arr[])
    {
       List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String args[])
    {
        int arr[]={2,7,4,5};
        List<Integer> num=reverse(arr);
        for(int n:num)
        {
            System.out.println(n);
        }
    }
}
