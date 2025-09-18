public class pairtarget {
    public static int[] find(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                    continue;
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,7,4};
        int target=8;
        int[] result=find(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
