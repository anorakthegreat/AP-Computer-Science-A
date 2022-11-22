public class Car {
    String model;
    int year;
    public Car(String m, int y){
        model = m;
        year = y;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setModel(String m){
        model = m;
    }   

    public String toString(){
        return "Model: " + model + " Year: " + year;
    }
}
