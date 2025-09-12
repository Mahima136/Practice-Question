import java.util.Scanner;
public class CharacterType{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.length() == 1){
            char ch = input.charAt(0);
            if(Character.isLetter(ch))
            System.out.println("Alaphabet");
            else if (Character.isDigit(ch))
            System.out.println("Digit");
            else
            System.out.println("Special");
        }else{
            System.out.println("Special");
        }
    }
}