public class operator {
    public static void main(String[] args) {
      double x = 5;
      double y = 6;
      double z;
      int b = 0;
  
      z = x + 5;
      y = y - 3;
      x = y * x;
      z = y / 2;
      //Casting
      z = (double)y/2; //temporary change 

      //Modulus
      z = 15%7;
      b = 15%7;
      System.out.println("z:" + z);
      System.out.println("y:" + y);
      System.out.println("x:" + x);
      System.out.println("b:" + b);
    }
  }