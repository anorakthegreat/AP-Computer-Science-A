import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            // x = scanner.nextLine();
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1){
                count++;
            }   
        }

        System.out.println(count);

        

        
        
        

        



    }
    
}
