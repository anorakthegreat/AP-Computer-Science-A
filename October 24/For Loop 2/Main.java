import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("In: ");
      int i = scan.nextInt();
      method1(i);

      
        
  }

  public static void method1(int i){
    for(int c = 1 ; c <= i; c++){
      System.out.print(" " + c + " ");
    }
  }
}