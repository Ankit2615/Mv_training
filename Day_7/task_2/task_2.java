import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2 {
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in); 
        char temp; 
        System.out.print("Enter your string chaaracter ");
        String input = sc.nextLine();    
        List<Character> charInput =  new ArrayList<>(); 
        for(char data:input.toCharArray())
        {
            charInput.add(data);
        }
        System.out.println("Your input :- " + charInput);  
        int len =  charInput.size(); 
        for(int i = 0; i < len;  i++){
            for(int j = i+1; j < len; j++){
                if(charInput.get(i) > charInput.get(j)){
                    temp = charInput.get(i); 
                    charInput.set(i ,charInput.get(j)); 
                    charInput.set(j , temp); 
                }
            }
        }
        System.out.println("Lists:- " + charInput + "Length :- " + len); 
    }
}