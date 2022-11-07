//staic methods can acces only acces static varables and methods. It cannot use non static methods
//non static methods can access static variables and methods
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) { 
      minMax(555);



    }

    public static void minMax(int c){
      int x = 9;
      int y = 0;
      for(int i = c; i!=0 ; i/=10){
        if(i%10 < x){
          x = i%10;
        }

        if(i%10 > y){
          y = i%10;
        }
      }

      System.out.println("Min: " + x);
      System.out.println("Max: " + y);
    }

    
};



