  public class Mammal { //class name is always uppercase
      //instance variables
      private String name;
      private int count;
      private boolean extinct;

      //constructor
      public Mammal(String n, int c, boolean e){
          name = n;
          count = c;
          extinct = e;
     
      }

      public Mammal(String n){
        name = n;
        count = 0;
        extinct = true;
   
      }

      public void setCount(int x){
        count += x;
      }

      public String getName(){
        return "Name: " + name;
      }


      

      public void descrip(){
        System.out.println("Name: " + name);
        System.out.println("Count: " + count);
        System.out.println("Extinct: " + extinct);


      }

      
    }
