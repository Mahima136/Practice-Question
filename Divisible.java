import java.util.Scanner;
public class Divisible{
    public static void main(String[]argd){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}