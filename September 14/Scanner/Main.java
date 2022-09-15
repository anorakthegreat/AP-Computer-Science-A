import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int x = scanner.nextInt();
        System.out.println(x);
        System.out.print("Enter a Decimal:");
        Double y = scanner.nextDouble();
        System.out.println(y);
        System.out.print("True or False:");
        boolean z = scanner.nextBoolean();
        System.out.println(z);
        System.out.print("Name:");
        String n = scanner.next();
        System.out.println(n);

        System.out.println(add(x, y));
    }


    public static int add(int x, double y){
        return x + (int)y;
    }
  }