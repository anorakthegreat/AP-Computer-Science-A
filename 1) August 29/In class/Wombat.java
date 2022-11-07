public class Wombat { //class name is always uppercase
    //instance variables
    private String name;
    private int idNum;

    //constructor
    public Wombat(String n, int i){
        name = n;
        idNum = i;
    }

    public Wombat(int i){
        name = "Unknown";
        idNum = i;
    }

    public Wombat(){
        name = "Unknown";
        idNum = 0; 
    }

    public String toString(){
        return "name" + name + "idNum" + idNum;
    }
  }