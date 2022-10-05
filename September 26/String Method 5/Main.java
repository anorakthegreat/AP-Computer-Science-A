import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(frontBack("Hlyello"));

    }

    public static String frontBack(String s){
        int x = s.indexOf("ly") + 1;
        System.out.println(s.indexOf("ly"));
        String d = s.substring(0, x+1) + "ly" + s.substring(x+1);
        return d.toUpperCase();
    }
  }