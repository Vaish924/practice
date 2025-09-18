import java.util.Arrays;

public class four {
    public static int find(int arr[])
    {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=arr[i-1])
            {
                //return arr[i];
                System.out.println(arr[i]);
            }
        }
        //return -1;
        return 1;
    }
    public static void main(String args[])
    {
        int arr[]={2,9,8,4,6};
        System.out.println(find(arr));
    }
}
