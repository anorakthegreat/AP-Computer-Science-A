import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      method4(2002, 2010);
      


    }

    public static void method4(int f, int s){
      int x = 0;
      for(int i = f ; i <= s ; i++){
        if(i % 4 == 0){
          x+=1;
        }
      }

      System.out.println(x);



  
    }
}



