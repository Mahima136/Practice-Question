import java.util.Scanner;
public class Numbercheck{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        if ( num > 0){
            System.out.println("The number is Positive.");
        }
        else if(num < 0){
            System.out.println("The number is Negative.");
        }
        else{
            System.out.println("The number is Zero.");
        }
        sc.close();
    }
}