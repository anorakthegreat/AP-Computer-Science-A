class Main {
    public static void main(String[] args) {

        //student class
        Student student1 = new Student("Joe", 2025);
        Student student2 = new Student("Bobby", 2026);
        Student student3 = new Student("Alex", 2027);
        Student student4 = new Student("Max", 2028);


        //flower class
        Flower flower1 = new Flower("lilly", "temperate climates", "yellow");
        Flower flower2 = new Flower("rose", "hot climates", "red");

        //Bird class   
        Bird bird1 = new Bird("seagull", "gray");
        Bird bird2 = new Bird("seagull");
        Bird bird3 = new Bird();

        //Car class

        Car car1 = new Car("Nisaan", "Altima", "black", 2015);
        Car car2 = new Car("Nisaan", "Altima");
        Car car3 = new Car();
        Car car4 = new Car("Nisaan" , 2015);







        System.out.println("");
        System.out.println("Student Class:");
        System.out.println("");
        student1.descrip();
        student2.descrip();
        student3.descrip();
        student4.descrip();
        System.out.println("");
        System.out.println("Flower Class");
        System.out.println("");
        flower1.descrip();
        flower2.descrip();
        System.out.println("");
        System.out.println("Bird Class");
        System.out.println("");
        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println(bird3);
        System.out.println("");
        System.out.println("Car Class");
        System.out.println("");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        
    }
  }