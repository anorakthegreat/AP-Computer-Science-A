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

      public String getName(){
        return "Name: " + name;
      }

      public String getRegion(){
        return "Region: " + region;
      }

      public String getColor(){
        return "Color: " + color;
      }

      public void setName(String x){
        name = x;
      }

      public void setRegion(String x){
        region = x;
      }

      public void setColor(String x){
        color = x;
      }

      

      public void descrip(){
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Color: " + color);


      }

      
    }
