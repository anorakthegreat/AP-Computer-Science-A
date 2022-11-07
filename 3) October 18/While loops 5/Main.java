import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        int x = 50000;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        while(x>0){
          System.out.println("Number bitch?");
          x = scan.nextInt();
          if(x>0){
            y += x;
          }

        }
        System.out.println(y);

        
  }
}