import java.util.Scanner;
public class Days{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        int years = days/365;
        days = days % 365;
        int months = days / 30;
        int remainingDays = days % 30;
        System.out.println("Years is equal to " + years + ",Month is equal to " + months + ",Days is equal to" + remainingDays);
        sc.close();
        }

    }
    
