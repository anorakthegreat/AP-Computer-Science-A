import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        //dosent work with primitative data types
        ArrayList<Integer> all = new ArrayList<Integer>();

        all.add(2);

        all.add(5);

        all.add(6);

        all.add(100);

        System.out.println(method1(all));
















        

    }

    public static boolean method1(ArrayList<Integer> al ){
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) == 100){
                return true;
            }
        }
        return false;
    }
}
