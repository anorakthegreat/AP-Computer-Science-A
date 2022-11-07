//staic methods can acces only acces static varables and methods. It cannot use non static methods
//non static methods can access static variables and methods
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      
      for(int row =1; row <= 5; row++){
        for(int col = 1; col <= row; col++){
          System.out.println(row);
        }
        System.out.println();
      }



    }

    
};



