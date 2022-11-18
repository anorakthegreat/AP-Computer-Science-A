import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            // x = scanner.nextLine();
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 6){
                if(nums[i] % 2 == 0){
                    System.out.println(nums[i]);
                } 
            }
        }

        

        
        
        

        



    }
    
}
