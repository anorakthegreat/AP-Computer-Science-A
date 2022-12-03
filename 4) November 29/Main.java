import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        //dosent work with primitative data types
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Double> al2 = new ArrayList<Double>();
        ArrayList<String> al3 = new ArrayList<String>();
        String[] arr = {"Ryan", "David", "Sally"};
        
        System.out.println(al1.size()); // length of the array

        al1.add(2); //adds at end of the array
        al1.add(4); //adds at end of the array
        al1.add(1); //adds at end of the array

        System.out.println(al1);

        for(String s : arr){
            al3.add(s);
        }

        al3.add(1, "Ethan");
        al3.add(al3.size()-1, "Sam");

        System.out.println(al3);

        al3.set(1, "Sam");

        System.out.println(al3);

        al1.set(0, al1.get(0) + 3);

        


















        

    }
}
