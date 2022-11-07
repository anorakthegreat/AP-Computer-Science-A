public class Car { //class name is always uppercase
    //instance variables
    private String make;
    private String model;
    private String color;
    private int year;

    //constructor
    public Car(String ma, String mo, String c, int y){
        make = ma;
        model = mo;
        year = y;
        color = c;
    }

    public Car(String ma, String mo){
        make = ma;
        model = mo;
        year = 0;
        color = "Unknown";
    }

    public Car(){
        make = "Unknown";
        model = "Unknown";
        year = 0;
        color = "Unknown";
    }

    public Car(String ma, int y){
        make = "ma";
        model = "Unknown";
        year = y;
        color = "Unknown";
    }

    public String toString(){
        return "Make: " + make + " Model: " + model + " Year: " + year + " Color: " + color;
    }
  }