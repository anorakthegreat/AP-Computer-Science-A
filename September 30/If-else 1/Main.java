import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String str1 = "Hi";
        String str2 = "Hi";

        double num1 = 3.4;
        double num2 = 5.6;
        if(str1.compareTo(str2) == 0){
            System.out.println("Similar variables inputted");
        }else{
            System.out.println("Different variables inputted");

        }

        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 > num2){
            System.out.println("First inputted variable is greater");
        }else{
            System.out.println("Second inputted variable is greater");

        }

        
  }
}