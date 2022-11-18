class Main {
    public static void main(String[] args) {
        
        Dog[] myDogs = {new Dog(3, "Dinky"), new Dog(5, "Binky")};
        
        for(int i = 0; i < myDogs.length; i++) {
            System.out.println(myDogs[i].getAge());
        }


    }
}
