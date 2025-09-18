public class gcdofarray {
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findarr(int[] arr,int n)
    {
        int result=arr[0];
        for(int i=1;i<n;i++)
        {
            result=gcd(result,arr[i]);
        }
        if(result==1)
        {
            return 1;
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[]={3,5,6};
        int n=arr.length;
        System.out.println(findarr(arr,n));
    }
}
