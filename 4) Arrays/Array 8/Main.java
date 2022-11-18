import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int count = 0;
        int nullCount = 0;
        Dog[] dogs = {new Dog("Fido", 3), new Dog("Rex", 5), new Dog("Spot", 13), null, null, null, new Dog("Lassie", 9)};
        int x = 0;
        for(Dog dog : dogs){
            System.out.println(dog);

            if(dog != null && dog.getAge() >= 10){
                count++;
            }


            if(dog != null && dog.getName().equals("Binky")){
                System.out.println("Found it");
            }

            if(dog!=null&&dog.getName().equals("Unknown")){
                dog.setName("Favorite Name");
            }

            if(dog == null){
                nullCount++;
            }

        }

        Dog[] newDog = new Dog[dogs.length-nullCount];

        for(int i = 0; i < dogs.length; i++){
            if(dogs[i] != null){
                newDog[x] = dogs[i];
                x++;
            }
        }
        System.out.println("New Array");
        for(int i = 0; i < newDog.length; i++){
            System.out.println(newDog[i]);
        }


        

        
        
        

        



    }
    
}
