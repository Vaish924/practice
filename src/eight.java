//count of smaller element
public class eight {
    public static int find(int arr[],int x)
    {
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<=x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int arr[]={5,2,1,3,5,6,7,9};
        int x=7;
        System.out.println("no of elements equql and less than given element is:"+find(arr,x));
    }
}
