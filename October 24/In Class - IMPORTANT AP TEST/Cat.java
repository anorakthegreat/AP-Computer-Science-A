  public class Cat { //class name is always uppercase
      //instance variables
    private String name;
    private int age;


      //constructor
      public Cat(String name, int age){
        this.name = name;
        this.age = age;
      }

      public void method1(){
        int x = 5;
        this.age = this.age + x;
      }

      public int method2(){
        method1();
        return this.age;
      }

}
