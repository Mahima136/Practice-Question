import java.util.Scanner;
public class Segregate{
    public static void main(String[]args){
        int[] arr = {0,1,0,1,0,0,1,1,1,0};
        int count0 = 0;
        for(int x : arr)
        if(x == 0) count0++;
        for(int i = 0; i < arr.length; i++)
        System.out.print(i < count0 ? 0 + " ": 1 + " ");
    }
}