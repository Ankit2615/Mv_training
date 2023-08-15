import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        System.out.println("Enter the size of pattern::");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<((s-1)/2);i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            for(int k=i;k<((s+1)/2);k++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<((s-1)/2);k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i){
                System.out.print("*");
                }
                else{  System.out.print(" "); }

            }

                System.out.println();
        }
        for(int d=0;d<(s+2);d++)
        {
            if((d==0)||(d==(s+1))||(d==((s+2)/2)))
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    
        for(int i=((s-1)/2);i>0;i--)
        {
			for(int j=1;j<=i+1;j++)
            {
                if(j==1||j==i)
                {
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            for(int k=i;k<((s+1)/2);k++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=((s-1)/2);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++)
            {
                if(j==1||j==i){
                System.out.print("*");
                }
                else{  System.out.print(" "); }

            }

                System.out.println();
        }
    }
}
