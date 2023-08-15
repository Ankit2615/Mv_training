import java.util.*; 
class task_15{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number to check Armstrong number: "); 
        int number = sc.nextInt(); 
        // Var for store sum of power  
        int sum = 0;  

        // Copy the input number in to another variable 
        int copy =  number;  

        // convert number in to string 
        String valueStr = Integer.toString(number); 

        // len of  String
        int len = valueStr.length(); 

        // armstrong logic
        while(number != 0) {
         int rem = number % 10;
         int mul = 1;
         for(int i = 1; i <= len; i++) {
            mul *= rem;
         }
         sum += mul;
         number /= 10;
      }
        if(sum == copy){
            System.out.println(copy + " is an ArmStrong number"); 
        }else{
            System.out.println(copy +  "is not an ArmStrong number"); 
        }
    }
}