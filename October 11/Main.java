import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String str1 = "AP CSA"; //these things go in a string pool BOIIIIIII //same adress for the same values :))
        String str2 = "AP CSA"; //str1 and str2 have same adress or reference
        System.out.println(str1==str2);//compares adress
        System.out.println(str1.equals(str2));//compares value of str1 and str2

        String str3 = new String("AP CSA"); //creates an OBJECT gonna be diff
        String str4 = new String("AP CSA"); //creates another one
        System.out.println(str3==str4);//compares adress(different adresses)
        System.out.println(str3.equals(str4));//compares value of str1 and str2(same value)

        
  }
}