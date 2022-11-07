 
// Create the following pattern using nested for loop:
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Main {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            for(int x = 1; x <= 5; x++){
                if(x == i){
                    System.out.print("2");

                }else{
                    System.out.print("*");
                }
                
            }
            System.out.println("");
        }
    }
}
