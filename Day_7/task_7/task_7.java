import java.util.*; 
class task_7{
    public static void main(String args []){
        Scanner sc =  new Scanner(System.in); 
        System.out.print("Enter number:- "); 
        int number = sc.nextInt(); 

        int k = number*2-1; 
        for(int i= 1; i<=k; i++){
            if(i==1 || i==number || i==k){
                for(int j =1; j<=number; j++){
                    if(j == 1|| j == number ){
                        System.out.print(" "); 
                    }else{
                        System.out.print("*");
                    }
                }
            }else{
                for(int j =1; j<=number;  j++){
                    if(j==1 || j==number){
                        System.out.print("*"); 
                    }else{
                        System.out.print(" "); 
                    }
                } 
            }
            System.out.println();  
        }
    }
}