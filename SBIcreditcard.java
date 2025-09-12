import java.util.Scanner;
public class SBIcreditcard{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int empType = sc.nextInt();
        int income = sc.nextInt();
        if (primaryAge >= 21 &&  primaryAge <= 60 && addonAge > 18 && income <= 300000 && empType >= 1 && empType <= 4)
        System.out.println("Eligible");
        else
        System.out.println("Not Eligible");
    }
}
