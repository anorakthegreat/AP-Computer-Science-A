import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[]s = {"sad", "tired", "happy"};
        int count = makeHappy(s);
        System.out.println(count);




    }

    public static int makeHappy(String[] n){
        int count = 0;
        for(String x : n){
            if(x.equals("happy")){
                count+=1;
            }
        }

        return count;

    }



}