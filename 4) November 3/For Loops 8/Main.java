//staic methods can acces only acces static varables and methods. It cannot use non static methods
//non static methods can access static variables and methods
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) { 
      minMax(205);
    }

    public static void minMax(int c){
      int x = 0;
      
      for(int i = c; i!=0 ; i/=10){
        x += i%10;    
      }
      System.out.println(x);
    
    }

} 



