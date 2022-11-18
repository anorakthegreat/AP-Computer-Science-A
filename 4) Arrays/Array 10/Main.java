import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 3};
        int count = 0;

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == 3){
                count++;
            }
        }

        System.out.println(count);

    }
    
}
