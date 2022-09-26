import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(frontBack("Hello"));

    }

    public static String frontBack(String s){
        s = s.substring(0, 2);
        return s + s + s + s;
    }
  }