public class three {
    public static int[] maxmin(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return new int[]{min,max};
    }
    public static void main(String args[])
    {
        int[] arr={2,8,5,9,5,7};
        int[] num=maxmin(arr);
        System.out.println("min is:"+num[0]);
        System.out.println("max is:"+num[1]);
    }
}
