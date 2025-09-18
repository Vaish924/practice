public class binarytodecimal {
    public static void main(String args[])
    {
        String b="111";
        int decimal=0;
        int power=0;
        for(int i=b.length()-1;i>=0;i--)
        {
            int bit=b.charAt(i);

            if(bit=='1')
            {
                decimal+=Math.pow(2,power);
            }
            power++;
        }
        System.out.println("decimal no is:"+decimal);
    }
}
