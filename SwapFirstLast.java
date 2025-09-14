import java.util.Scanner;
public class SwapFirstLast{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(s.length() == 1){
            System.out.println(n);
        }else{
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            String result = last + s.substring(1,s.length() - 1) + first;
            System.out.println(result);
        }
        }
        }