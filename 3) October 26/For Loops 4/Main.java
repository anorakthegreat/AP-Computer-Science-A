import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      
      method1(295);

    }

    public static void method1(int i){
      for(int c = i ; c != 0; c/=10){
        int x = c%10;
        System.out.print(" " + i%x + " ");
      }  
    }
};



