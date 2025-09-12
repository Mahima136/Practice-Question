import java .util.Scanner;
public class MaxMin{
    public static void main(String[]args){
        int a = 12,b = 7;
        int max = ( a > b) ? a : b;
        int min = ( a < b) ? a : b;
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}