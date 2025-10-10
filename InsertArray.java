import java.util.Scanner;
public class InsertArray{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int pos = 2;
        int val = 10;
        int[] newArr = new int[arr.length + 1];
        for(int i = 0, j = 0; i < newArr.length; i++){
            if(i == pos) 
            newArr[i] = val;
            else
             newArr[i] = arr[j++];
        }
        for(int num: newArr)
        System.out.print(num + " ");
    }
}
        