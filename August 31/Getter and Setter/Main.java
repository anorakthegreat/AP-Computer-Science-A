class Main {
    public static void main(String[] args) {
        Wombat wom1 = new Wombat("Binky", 2);
        System.out.println(wom1.getName());
        System.out.println(wom1.getAge());
        wom1.setName("Dinky");
        wom1.setAge(4);
        System.out.println(wom1);
        System.out.println(wom1.getName());
        System.out.println(wom1.getAge());

    }
  }
