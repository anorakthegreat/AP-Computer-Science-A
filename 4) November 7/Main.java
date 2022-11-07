class Main {
    public static void main(String[] args) {
        int[] scores = new int[5];

        String[] names = new String[4];
        
        //default values for int is 0 and for String is null, double is 0.0, boolean is false
        int[] num = {1, 2, 3, 4, 5};
        String [] names1 = {"John", "Mary", "Bob", "Alice"};

        for(int i = 0; i<names1.length; i++) {
            System.out.println(names1[i]);
        }

        for(int i = 0; i<num.length; i++) {
            System.out.println(num[i]);
        }




    }
}
