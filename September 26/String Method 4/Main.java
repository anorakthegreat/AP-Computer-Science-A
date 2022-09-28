import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        // System.out.println(frontBack("Hello"));

        String s = "go away";

        String l = "Go away";

        System.out.println(s.equals(l));

    }

    public static String frontBack(String s){
        s = s.substring(0, 2);
        return s + s + s + s;
    }
  }