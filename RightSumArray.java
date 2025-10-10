import java.util.Scanner;
public class RightSumArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
        int sum = 0;
        for(int i = n-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = sum;
            sum += temp;
        }
        System.out.println("Modified array:");
        for(int x : arr) 
        System.out.print(x + " ");
    }
}
