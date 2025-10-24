public class CheckSorted{
    public static void main(String[]args){
        int[] x = {3,1,2,4,5};
        boolean sorted = true;
        for(int i = 0; i < x.length-1; i++){
            if(x[i] > x[i + 1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
            