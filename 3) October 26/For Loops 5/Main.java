import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      
      method1(0);


    }

    public static void method1(int i){
      int x;
      boolean y = true;
      for(int c = i ; c != 0; c/=10){
        x = c%10;
        if(i%x == 0){
          y = y && true;
        }else{
          y = y && false;
        }
      
      }

      if(i<=0){
        System.out.println(y);
      } else {
        System.out.println("false");
      }
    }
}



