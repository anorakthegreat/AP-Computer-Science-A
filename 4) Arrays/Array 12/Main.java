import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] a = {2,4,5,6,4,7,0};
        int[] z = revArray(a);

        for(int x : z){
            System.out.print(x);
        }

    }


    public static int[] revArray(int[] n){
        int[] arr = new int[n.length];
        int z = 0;
        for(int i = n.length - 1; i > 0; i--){
            arr[i] =  n[z];
            z++;
        }

        return arr;
    }
    
}
