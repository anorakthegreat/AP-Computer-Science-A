import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String x;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Word");
        x = scan.next();
        int y = 0;
        
        while(x.indexOf("x") != -1 || x.indexOf("X") != -1){
          y +=1;
          x = x.substring(0, x.indexOf("x")) + x.substring(x.indexOf("x")+1);
          
        }
        System.out.println("Number of x's: " + y);

        
  }
}