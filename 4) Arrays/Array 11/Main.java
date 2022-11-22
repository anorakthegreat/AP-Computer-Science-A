import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] arr = fizzArray(10);

        for(int n : arr){
            System.out.println(n);
        }

    }


    public static int[] fizzArray(int n){
        int[] arr = new int[n];

        for(int i = 0; i <= n-1; i++){
            arr[i] = i;
        }

        return arr;
    }
    
}
