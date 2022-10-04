class Main {
    public static void main(String[] args) {
    if(4<5 && 11>10){
        System.out.println("true");
    }else{
        System.out.println("false");
    }

    //Wrapper Classes : Int and Double

    Integer x = 5;
    Double y = 2.5;

    System.out.println(x.intValue()); //changes it into regular int variable
    System.out.println(y.doubleValue()); 

    System.out.println(Integer.MIN_VALUE); 
    System.out.println(Integer.MAX_VALUE); 

  }
}