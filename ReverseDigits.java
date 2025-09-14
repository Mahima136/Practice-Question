import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0, digit;
        int temp = num;
        while(temp > 0){
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}