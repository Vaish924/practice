public class five {
    public static int find(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int arr[]={2,5,8,4};
        System.out.println("sum is:"+find(arr));
    }
}
