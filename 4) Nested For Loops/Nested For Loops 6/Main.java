 
// Create the following pattern using nested for loop:
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int x = 4; x >= i; x-=1){
                System.out.print("*");

            }
            System.out.println(i);
            System.out.println("");
        }
    }
}
