import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(sqrtRoot(1));
        System.out.println(abValue(1, 2));
        System.out.println(randomGen());
        System.out.println(powerX(1, 2));




    }

    public static double sqrtRoot(int i){
        return Math.sqrt((5*i) - 4);
    }

    public static double abValue(int x, int y){
        return Math.abs(2*x - 3*y);
    }

    public static int randomGen(){
        return (int)(Math.random() * (40-12+1)) + 12;

    }

    public static double powerX(int x, int y){
        return Math.pow(x, 2) + Math.pow(y, 5);

    }
  }