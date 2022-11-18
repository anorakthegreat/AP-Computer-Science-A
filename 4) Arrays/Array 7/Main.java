import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       
        double x = 0;
        boolean y = false;
        Scanner scan = new Scanner(System.in);

        double[] gpa = new double[5];

        if(y == false){
            for(int i = 0; i<gpa.length; i++){
                System.out.println("Enter GPA");
                gpa[i] = scan.nextDouble();
            }
    
            for(int i = 0; i<gpa.length; i++){
                System.out.print(gpa[i] + ",");
                if(gpa[i] >= x){
                    x = gpa[i];
                }
            }
    
            System.out.println("");
            System.out.println("HIGHEST GPA: " + x);
            y = true;
    
        }

        
        
        

        



    }
    
}
