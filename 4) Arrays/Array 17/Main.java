import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] y = {3,4};
        int[] w = biggerTwo(x, y);
        for(int r : w){
            System.out.print(r + ",");
        }




    }

    public static int[] biggerTwo(int[]n, int[]y){
        int sum1 = 0;
        int sum2 = 0;
        // int[] = {"1"}
        for(int x : n){ 
            sum1+=x;
        }
        for(int f: y){
            sum2+=f;
        }

        if(sum1 > sum2){
            return n;
        } else if(sum2 > sum1){
            return y;
        } else{
            return n;
        }

    }



}