import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//remove duplicates from sorted array
public class nine {
   public static int find(int arr[])
   {
       int idx=0;
       HashSet<Integer> s=new HashSet<>();
       for(int i=0;i<arr.length;i++)
       {
           if(!s.contains(arr[i]))
           {
               s.add(arr[i]);
               arr[idx++]=arr[i];
           }
       }
       return idx;
   }
    public static void main(String args[])
    {
        int arr[]={2,2,2,4,4,6,6,6,7,7};
        int n=find(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
