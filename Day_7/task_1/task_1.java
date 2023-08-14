import java.util.*; 
class task_1{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in); 
        String usrInput = sc.nextLine(); 
        usrInput = usrInput.replaceAll("\\s","");
        System.out.print("After removing space :- "+ usrInput);  
    }
}