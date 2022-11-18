class Main {
    public static void main(String[] args) {
       
        
        boolean x = false;
        double[] yes = {4,5,2,3,6};


        for(int i = 0; i < yes.length; i++){
            if(i != yes.length -1 && (yes[i] == 2 && yes[i+1] == 3)){
                x = true;
            }
        }

        System.out.print("{");
        for(int i = 0; i < yes.length; i++){
            System.out.print(yes[i] + ",");
        }
        System.out.println("}");
        if(x == true){
            System.out.print("YES");
        }else{
            System.out.println("NO");
        }
        

        



    }
}
