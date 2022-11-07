class Main {
    public static void main(String[] args) {


        //flower class
        Mammal m1 = new Mammal("bird", 5, false);
        Mammal m2 = new Mammal("Wolly Mammth");

        m1.setCount(5);
        m2.setCount(6);

        System.out.println(m1.getName());
        System.out.println(m2.getName());

        m1.descrip();
        m2.descrip();



        
    }
  }