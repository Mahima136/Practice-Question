import java.util.Scanner;
public class Mileage{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting and ending odometer readings: ");
        double start = sc.nextDouble();
        double end = sc.nextDouble();
        double distance = end - start;
        double rate = 25.0;
        double remuneration = distance * rate;
        System.out.printf("%.2f %.2f\n",distance,remuneration);
        sc.close();
    }
}