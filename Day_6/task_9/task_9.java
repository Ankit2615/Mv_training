import java.util.*; 
class task_9{
    public static void main(String args []){
        Scanner input =  new Scanner(System.in); 
        System.out.print("Enter Your Strig :- " ); 
        String userInput = input.nextLine(); 
        System.out.print("Enter Number :- " );
        int number = input.nextInt(); 
        String word[] = userInput.split(" ");
        System.out.println(word[number-1]); 
    }
}


   
