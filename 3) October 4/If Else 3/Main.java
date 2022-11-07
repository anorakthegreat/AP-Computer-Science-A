class Main {
    public static void main(String[] args) {
    String str = "sdcsd";
    String str2 = "sdcsdc";

    if(str.indexOf("c") == str2.indexOf("c")){
        System.out.println("Same place");
    }else if(str.indexOf("c") < str2.indexOf("c")){
        System.out.println("First");
    }else if(str.indexOf("c") > str2.indexOf("c")){
        System.out.println("Second");
    }else{
        System.out.println("Cant decide");
    }

    System.out.println(calcGrade(90));
    System.out.println(redTicket(1,2,3));


  }

  public static String calcGrade(int x){
    if(x <= 99 && x >= 90){
        return "A";
    }else if(x <= 89 && x >= 80){
        return "B";
    }else if(x <= 79 && x >= 70){
        return "C";
    }else if(x <= 69 && x >= 60){
        return "D";
    }else{
        return "F";
    }
  }

  public static int redTicket(int x, int y, int z){
    if(x == y && y == z && x ==z && x==2){
        return 10;
    } else if(x == y && y == z && x ==z){
        return 5;
    }else if(x == y && y == z && x ==z){
        return 5;
    }else if(x != z && x != y){
        return 1;
    }else{
        return 0;
    }
  }
}