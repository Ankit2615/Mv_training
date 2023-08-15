import java.util.*; 
class task_12{
    public static void main(String args []){
        Scanner input =  new Scanner(System.in); 
        System.out.print("Enter Your Strig :- " ); 
        String userInput = input.nextLine(); 
        String word[] = userInput.split(" ");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(word));
        Collections.reverse(strList); 
        System.out.println(strList); 
    }
}


   
