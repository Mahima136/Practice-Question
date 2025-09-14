import java.util.Scanner;
public class PrintDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        for(int i = 0; i < str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}