import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] a = {3,4,13,6,4,7,4};
        System.out.println(sum13(a));

    }


    public static int sum13(int[] n){
        int sum = 0;
        for(int x : n){
            if(x != 13){
                sum += x;
            } else if(x == 13){
                break;
            }
        }

        return sum;
        
    }
    
}
