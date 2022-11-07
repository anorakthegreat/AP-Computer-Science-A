import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String n = scanner.nextLine();

        System.out.print("Age:");
        int a = scanner.nextInt();
        

        System.out.print("Salary:");
        int s = scanner.nextInt();
        
        String x = scanner.nextLine();

        System.out.print("Address:");
        String ad = scanner.nextLine();

        System.out.println("");
        System.out.println("Employee Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Salary: " + s);
        System.out.println("Address: " + ad );

    }



  }