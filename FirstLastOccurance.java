import java.util.Scanner;
public class FirstLastOccurance{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        String s = Integer.toString(n);
        int first = s.indexOf(d + '0');
        int last = s.lastIndexOf(d + '0');
        if(first == -1){
            System.out.println("Digit not found");
        }else{
            System.out.println("First = " + first + ", Last = " + last);
        }
    }
}