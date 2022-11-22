import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] a = {2,4,5,6,4,7,4};
        int[] z = makeLast(a);

        for(int x : z){
            System.out.print(x);
        }

    }


    public static int[] makeLast(int[] n){
        int[] arr = new int[n.length * 2];

        arr[arr.length-1] = n[n.length-1];

        return arr;
        
    }
    
}
