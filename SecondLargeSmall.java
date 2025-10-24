import java.util.Arrays;
public class SecondLargeSmall{
    public static void main(String[]args){
        int[] a = {5,2,8,1,9};
        Arrays.sort(a);
        System.out.println("Second smallest: " + a[1]);
        System.out.println("Second largest: " + a[a.length-2]);
    }
}
    
