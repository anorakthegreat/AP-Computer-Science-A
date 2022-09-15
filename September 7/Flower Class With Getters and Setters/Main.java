class Main {
    public static void main(String[] args) {


        //flower class
        Flower flower1 = new Flower("lilly", "temperate climates", "yellow");
        Flower flower2 = new Flower("rose", "hot climates", "red");

        System.out.println(flower1.getName());
        System.out.println(flower1.getRegion());
        System.out.println(flower1.getColor());
        
        System.out.println(flower2.getName());
        System.out.println(flower2.getRegion());
        System.out.println(flower2.getColor());

        flower1.setName("rose");
        flower1.setRegion("hot climates");
        flower1.setColor("red");

        flower2.setName("rose");
        flower2.setRegion("hot climates");
        flower2.setColor("red");

        flower1.descrip();
        flower2.descrip();

    
        System.out.println("");

        
    }
  }