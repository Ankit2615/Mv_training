import java.util.*; 
class task_7{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Write a program to swap two numbers without using a third variable.");
        System.out.print("Enter First Num :- "); 
        int num = sc.nextInt(); 
        System.out.print("Enter Second Num :- "); 
        int num_2 = sc.nextInt(); 
        System.out.println("Before swaping Number 1:- "+ num + " & Number 2 is:- "+ num_2); 
        num = num * num_2; // if num 10 and num2 = 5 then num = 50
        num_2 = num / num_2; // num_2 == 50/5 == 5 
        num = num / num_2; // then num = 50 n num_2 = 5 == 10
        System.out.println("Afrer swaping Number 1:- "+ num + "& Number 2 is:- "+ num_2); 
    }
}