import java.util.*; 

class task_6{
    // hollow squre with space
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the num of row n column u wana print:- "); 
        int num = sc.nextInt();
        for(int i= num; i>0; i--){

            // for space 
            for(int k = 0; k<i-1; k++){
                System.out.print(" "); 
            }if(i == num || i == 1){
                for(int j = 0; j<num; j++){
                    System.out.print("*"); 
                }
            }else{
                 for(int j=0;j<num;j++)
                {
                    if(j==0||j==(num-1))
                    {System.out.print("*");}
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();  
        }
    }
}