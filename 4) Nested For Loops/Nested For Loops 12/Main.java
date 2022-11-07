 
// Create the following pattern using nested for loop:
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int x = 2; x <= 18; x+=4){
                System.out.print(x*i + " ");
                
            }
            System.out.print("7");
            System.out.println("");
        }
    }
}
