 
// Create the following pattern using nested for loop:
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for(int x = 1; x <= 4; x++){
                System.out.print("(" + i + "," + x + ")");

            }
            System.out.println("");
        }
    }
}
