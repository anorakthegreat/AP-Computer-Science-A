public class Flower { //class name is always uppercase
    //instance variables
    private String name;
    private String region;
    private String color;

    //constructor
    public Flower(String n, String r, String c){
        name = n;
        region = r;
        color = c;
    }

    public void descrip(){
      System.out.println("Name" + name);
      System.out.println("Region" + region);
      System.out.println("Color" + color);


    }

    
  }
