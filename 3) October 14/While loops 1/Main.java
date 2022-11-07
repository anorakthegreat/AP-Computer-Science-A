import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        int y = 0;
        int x = 1;
        while(x <= 20){
          System.out.println(x);
          y = y+x;
          x++;
          
        }
        System.out.println(y);
        System.out.println((double)y/20);

        
  }
}