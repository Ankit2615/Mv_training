import java.util.*; 
class task_5{
    // hollow tringle 
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in); 
        System.out.println("How many rows u want to prit :- "); 
        int num = sc.nextInt(); 
        // for row 
        for(int i = 0; i<num ; i++){
            // for space
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }   
            // for star
            for (int k = 0; k < 2 * i + 1; k++) {
                if (i == 0 || i == num - 1) {
                    System.out.print("*");
                }
                else {
                    if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                    }
                    else {
                    System.out.print(" ");
                    }
                }
            }
            System.out.println();  
        }
    }
}