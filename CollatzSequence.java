import java.util.Scanner;
public class CollatzSequence{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            System.out.print(n + " ");
            if( n == 1) break;
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
    }
}

		