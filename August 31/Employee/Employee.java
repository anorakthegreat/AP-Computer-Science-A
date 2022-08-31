public class Employee { //class name is always uppercase
    //instance variables
    private boolean yearRetiring;
    private int id;

    //constructor
    public Employee(boolean y, int i){
        yearRetiring = y;
        id = i;
    }

    public Employee(int i){
        id = i;
        yearRetiring = false;
    }

    public Employee(){
        id = 0;
        yearRetiring = false;
    }

    public String toString(){
        return "id: " + id + " yearRetiring: " + yearRetiring;
    }
  }