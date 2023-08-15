import java.io.*; 
import java.util.Scanner; 
class task_14{
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("entr the string"); 
        String value = null ; 
        try{
            if(value.equals("Hello")){
                System.out.print("Same "); 
            }else{
                System.out.print("Not samw"); 
            }
        catch(NullPointerException e){
            System.out.print("NullPointerException  Caught");  
        }
        }
    }
}