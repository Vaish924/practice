public class perfectsquarroot {
    public static int find(int n)
    {
        int root=(int)Math.sqrt(n-1);
        return root;
    }
    public static void main(String args[])
    {
        int n=16;
        int count=find(n);
        System.out.println(count);
    }
}
