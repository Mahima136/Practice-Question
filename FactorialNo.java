import java.util.Scanner;
public class FactorialNo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        if(n < 0){
            System.out.println("Error: Factorial of a negative number does not exist.");
        }
        else{
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.println(fact);
        }
        }
}