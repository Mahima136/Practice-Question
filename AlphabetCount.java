public class AlphabetCount{
    public static void main(String[]args){
        String str = "HeLlo123 World!";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }
        }
        System.out.println("Alphabet count: " + count);
    }
}