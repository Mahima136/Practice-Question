import java.util.*;
public class Descendingorder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        for(int i = digits.length - 1; i >= 0; i--)
        {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}