import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(frontBack("mg"));

    }

    public static String frontBack(String s){
        int i = s.length()/2;
        String n = s.substring(i);
        n = n + s.substring(0, i);
        return n.toUpperCase();
    }
  }