import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String x;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Word");
        x = scan.next();
        
        while(x.length() >= 1){
          System.out.println(x);
          x = x.substring(0, x.length()-1);
          
        }

        
  }
}