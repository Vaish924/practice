public class fifteen {
    public static int find(int arr[])
    {
        int duplicate=-1;
        int count=0;
        for(int n:arr)
        {
            if(count==0)
            {
                duplicate=n;
                count=1;
            }
            if(duplicate==n)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int n:arr)
        {
            if(duplicate==n)
            {
                duplicate=n;
                count++;
            }
        }
        if(count>= arr.length/2)
        {
            return duplicate;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={4,8,2,5,9,2,2,2};
        int n=find(arr);
        System.out.println(n);
    }
}
