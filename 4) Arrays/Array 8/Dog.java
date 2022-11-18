import java.io.ObjectInputStream.GetField;

public class Dog {
    String name;
    int age;
    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String toString(){
        return "Name: "+name + " Age: " + age;
    }
    




}
