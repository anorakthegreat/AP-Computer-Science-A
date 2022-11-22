import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Car[] cars = {new Car("Tesla Model S", 2012), new Car("Telsa Roadster", 2029), new Car("Toyota Prius", 2022), null, null};
        int count = 0;
        int nullCount= 0;
        int x = 0;
        for(Car c : cars){
            if(c != null && c.getYear() >= 2020){
                count+=1;
            }
            if(c!= null && c.getModel().equals("Accord")){
                System.out.println("Sorry, we dont have that");
            }
            if(c == null){
                nullCount ++;
            }
            System.out.println(c);
        }

        Car[] carsNoNull = new Car[cars.length - nullCount];

        for(int i = 0; i < carsNoNull.length; i++){
            if(cars[i] != null){
                carsNoNull[x] = cars[i];
                x++; 
            }
        }

        System.out.println("newArray:");

        for(Car c : carsNoNull){
            System.out.println(c);
        }



        System.out.println("Older than 2020: " + count);



    }



}