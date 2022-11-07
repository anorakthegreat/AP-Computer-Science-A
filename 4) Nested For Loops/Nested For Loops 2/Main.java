 
// Create the following pattern using nested for loop:
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int x = 1; x <= i; x++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
