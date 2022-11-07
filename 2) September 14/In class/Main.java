public class Main {
    public static void main(String[] args) {
        method1();
        int ans = mult(1, 2);
        System.out.println(ans);
    }

    public static void method1(){
        System.out.println("First static method");
    }

    public static int mult(int x, int y){
        return x*y;
    }
  }