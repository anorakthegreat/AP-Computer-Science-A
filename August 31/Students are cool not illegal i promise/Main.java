class Main {
    public static void main(String[] args) {

        //student class
        Student student1 = new Student("Joe", 2025);
        Student student2 = new Student("Bobby", 2026);
        Student student3 = new Student("Alex", 2027);

        System.out.println("");
        System.out.println("Student Class:");
        System.out.println("");

        System.out.println(student1.getName());
        System.out.println(student1.getYear());
        student1.setName("Bobby");
        student1.setYear(2031);
        student1.descrip();

        System.out.println("");

        System.out.println(student2.getName());
        System.out.println(student2.getYear());
        student2.setName("Joe");
        student2.setYear(2051);
        student2.descrip();

        System.out.println("");

        System.out.println(student3.getName());
        System.out.println(student3.getYear());
        student3.setName("Max");
        student3.setYear(2060);
        student3.descrip();


        //student2.descrip();
        //student3.descrip();

        
    }
  }