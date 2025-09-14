import java.util.Scanner;
public class ProductOfDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        if( n == 0){
            product = 0;
        }else{
            while(n > 0){
                int d = n % 10;
                product *= d;
                n /= 10;
            }
        }
        System.out.println(product);
        }
}