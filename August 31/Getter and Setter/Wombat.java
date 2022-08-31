public class Wombat { //class name is always uppercase
    //instance variables

    private String name;
    private int age;

    public Wombat(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String na){
        name = na;
    }

    public String toString(){
        return "Name" + name + "age" + age;
    }

  }