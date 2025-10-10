import java.util.Scanner;
public class DeleteValue{
    public static void main(String[]args){
        int[] a = {10,20,30,40,50};
        int pos = 2;
        for(int i = pos; i < a.length-1; i++)
        a[i] = a[i+1];
        System.out.print("After deletion: ");
        for(int i = 0; i < a.length-1; i++)
        System.out.print(a[i] + " ");
    }
}