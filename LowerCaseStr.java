public class LowerCaseStr{
    public static void main(String[]args){
        String str = "HeLlo WorLD";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(ch);
            }
        }
    }
}