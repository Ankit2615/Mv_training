import java.util.*; 
import java.math.BigDecimal;
class task_11_1{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a decimal number:- "); 

        BigDecimal num = sc.nextBigDecimal(); 

        // Conever number bigdecimal to int
        int intVal = num.intValue(); 

        // Convert number into decimal part
        BigDecimal decimalVal = num.remainder(BigDecimal.ONE); 

        //Convert decimal part in to integr 
        while(decimalVal.remainder(BigDecimal.ONE).floatValue() > 0){
            decimalVal =  decimalVal.movePointRight(1); 
        }
        int decimalPart = decimalVal.intValue(); 

        System.out.println("decimal number into reverse order:- "); 

        // reverse decimal part
        int remainder; 
        while((remainder = decimalPart % 10) != 0){
            System.out.println(remainder); 
            decimalPart = decimalPart/10; 
        }
        System.out.print("."); 
        // reverse int part 
        while((remainder = intVal % 10) != 0){
            System.out.print(remainder); 
            intVal = intVal/10; 
        }
        
    }
}