public class Test {
    
    public String[] method1(String[] stra){
        String [] newarr = new String[stra.length+1];
        int x = 0;
        for(String el: stra){
            newarr[x] = el;
            x++;
        }

        newarr[x] = "David";
        return newarr;
    }
    
}
