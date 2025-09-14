import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = 0, prod =1;
        for(int temp = n; temp > 0; temp /= 10){
            int d = temp % 10;
            sum += d;
            prod *= d;
        }
        System.out.println((sum == prod) ? n + " is a Spy Number" : n + " is NOT a Spy Number");
    }
}