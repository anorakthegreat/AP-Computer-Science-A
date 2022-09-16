import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int x = scanner.nextInt();

        System.out.print("Enter an Integer:");
        int y = scanner.nextInt();

        System.out.println(comNum(x,y));

        System.out.println(addNum(x,y));



    }


    public static boolean comNum(int x, int y){
        return x==y ;
    }

    public static int addNum(int x, int y){
        return x + y;
    }
  }