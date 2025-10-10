public class SwapPairs{
    public static void main(String[]args){
        int[] a = {10,20,30,40,50,60};
        for (int i = 0; i < a.length-1; i += 2){
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }
    System.out.print("After swapping: ");
    for (int x : a)
    System.out.print(x + " ");
}
}


