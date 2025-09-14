import java.util.Scanner;
public class StrongNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while (temp > 0){
            int d = temp % 10,fact = 1;
            for(int i = 1; i <= d;i++)
            fact *= i;
            sum += fact;
            temp /= 10;
        }
        System.out.println((sum == n) ? n + " is a Strong Number" : n + " is NOT a Strong Number");
    }
}
