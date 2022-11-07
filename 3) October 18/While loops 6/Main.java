import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        int x = 50000;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Number?");
        x = scan.nextInt();

        while(x>=0){
          System.out.print("Your New Number:");
          System.out.println(x);
          x-=10;

        }

        
  }
}