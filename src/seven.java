public class seven {
    public static void rotate(int arr[],int d)
    {
        int n= arr.length;
        for(int i=0;i<d;i++)
        {
            int first=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,8,4,5,9};
        int d=1;
        rotate(arr,d);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
