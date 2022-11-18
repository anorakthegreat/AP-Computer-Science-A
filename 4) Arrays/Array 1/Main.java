import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String x = "";
        String[] names = new String[4];

        for(int i = 0; i < names.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            // x = scanner.nextLine();
            names[i] = scanner.nextLine();
        }
        System.out.println("");

        System.out.print("{");
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ",");
        }
        System.out.print("}");

        

        
        
        

        



    }
    
}
