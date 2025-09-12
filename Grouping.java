import java .util.Scanner;
public class Grouping{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int gender = sc.nextInt();
        if(gender != 1 && gender != 2){
            System.out.println("Invalid");
        }
        else if (age < 25 && gender == 1){
             System.out.println("1");
        }
        else if ( age < 25 && gender == 2){
             System.out.println("2");
        }
        else if ( age >= 25 && age <= 45 && gender == 1){
             System.out.println("3");
        }
        else if ( age >= 25 && age <= 45 && gender == 2){
             System.out.println("4");
        }
        else if ( age > 45){
             System.out.println("5");
        }
        sc.close();
    }
}