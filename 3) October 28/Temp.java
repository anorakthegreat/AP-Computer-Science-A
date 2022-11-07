public class Temp {
    private int temp;
    private static int totalTemp = 0;
    private static int avgMinTemp = 0;

    public Temp(int t){
        temp = t;
        totalTemp += 1;
    }

    public int getTemp(){
        return temp;
    }

    public static int getTotalTemp(){
        return totalTemp;
    }


    
}
