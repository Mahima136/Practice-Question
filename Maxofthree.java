import java.util.Scanner;
public class Maxofthree{
    public static void main(String[]args){
        int a = 12, b = 45, c = 23;
        int max;
        if(a >= b && a >= c){
            max = a;
        }
        else if (b >= a && b >= c){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println("Maximum = " + max);
    }
}