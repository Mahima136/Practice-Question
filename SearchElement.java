import java.util.Scanner;
public class SearchElement{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
        int key =sc.nextInt();
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}