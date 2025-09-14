import java.util.Scanner;
public class CenterDigit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(s.length() % 2 == 1){
            int mid = s.length() / 2;
            System.out.println(s.charAt(mid));
        }else{
            System.out.println(-1);
        }
            }
        }