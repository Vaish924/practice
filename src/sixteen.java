public class sixteen {
    public static void find(int arr[])
    {
        for(int i=0;i<arr.length-1;i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,5,6,2,8};
        find(arr);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
