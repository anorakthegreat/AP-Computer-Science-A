class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4};
        int x = 0;
        int[] other = new int[num.length + 1];

            // for(int i = 0; i < num.length; i++) {
            //     if( i != num.length-1 && (num[i] == 4 && num[i+1] == 5)){
            //         other[x] = num[i];
            //         x++;
            //         other[x] = 3;
            //         x++;

            //     }else{
            //         other[x] = num[i];
            //         x++;
            //     }
            // }
        
        
        //append value
        // for (int i = 0; i < num.length; i++) {
        //     other[i] = num[i];
        //     x++;
        // }

        // other[x] = 44;
        




        //remove all of the 4's from the array
        
        // for(int i = 0; i < num.length; i++) {
        //     if(num[i] != 4) {
        //         other[x] = num[i];
        //         x++;
        //     }
        // }

        // for(int i = 0; i < other.length; i++) {
        //     System.out.println(other[i]);
        // }

        //remove the last element

        // for(int i = 0; i < num.length - 1; i++) {
        //     // if(i != num.length-1) {
        //     //     other[i] = num[i];
        //     // }
        //     other[i] = num[i];
        // }
        // for(int i = 0; i < other.length; i++) {
        //     System.out.println(other[i]);
        // }

        
        for(int i = 0; i < other.length; i++) {
            System.out.println(other[i]);
        }



    }
}
