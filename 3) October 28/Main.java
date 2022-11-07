//staic methods can acces only acces static varables and methods. It cannot use non static methods
//non static methods can access static variables and methods
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
      
      Temp t1 = new Temp(39);
      Temp t2 = new Temp(40);
      System.out.println(Temp.getTotalTemp());



    }

    
};



