import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            for(int k=i;k<s;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
               
                
              if(j!=i)
                    {
                       System.out.print("*"+i); 
                    }
                    else{System.out.print("*");}
           

            }
            System.out.println();
        }
    }
}
