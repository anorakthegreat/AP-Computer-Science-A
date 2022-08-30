public class Student { //class name is always uppercase
    //instance variables
    private String name;
    private int grad_year;

    //constructor
    public Student(String n, int y){
        name = n;
        grad_year = y;
    }

    public void descrip(){
        System.out.println("Name:" + name);
        System.out.println("Grad Year" + grad_year);
    }

    
  }