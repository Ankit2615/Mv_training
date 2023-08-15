import java.util.*; 
class task_4{
    public static void main(String args []){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the num of size u wana print  the pattern :- "); 
        int number = sc.nextInt(); 
        for(int i = 0; i<number;  i++){
            for(int j = 0; j <=i; j++){
                if(j == 0 || j == i){
                    System.out.print("*"); 
                }
                else if(i == number-1){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}