public class Bird { //class name is always uppercase
    //instance variables
    private String name;
    private String color;

    //constructor
    public Bird(String n, String c){
        name = n;
        color = c;
    }

    public Bird(String n){
        name = n;
        color = "Unknown";
    }

    public Bird(){
        name = "Unknown";
        color = "Unknown"; 
    }

    public String toString(){
        return "name: " + name + " color: " + color;
    }
  }