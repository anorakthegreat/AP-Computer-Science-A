class Main {
    public static void main(String[] args) {
    System.out.println(calculateEqn(2));

  }

  public static double calculateEqn(int x){
    return 2 * Math.pow(x, 3) + Math.sqrt(x) - 2*Math.abs(x);
  }
}