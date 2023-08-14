import java.util.*; 
public class task_12{
    public static void main(String args []){
        StringBuffer sb = new StringBuffer(""); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter your string value :-"); 
        sb.append(sc.nextLine()); 

        System.out.println("enter start index :- "); 
        int startNum = sc.nextInt(); 

        System.out.println("enter end index:- "); 
        int endNum = sc.nextInt();

        System.out.println("Output :- " +sb.delete(startNum,endNum)); 
    }
}