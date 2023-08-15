import java.util.*; 
class task_8{
    public static void main(String args []){
        List<Integer> lst = new ArrayList<Integer>(); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the num till u want to find the odd num :- "); 
        int lastNum = sc.nextInt(); 
        for(int i = 1; i<=lastNum; i++){
            if(i % 2 != 0){
                lst.add(i); 
            }
        }
        System.out.print("List of the odd number which u want to show :- "+ lst); 
    }
}