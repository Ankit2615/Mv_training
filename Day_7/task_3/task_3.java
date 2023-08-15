import java.util.Scanner;
class task_3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter how many numbers u want to add in arrray:- "); 
            int number = sc.nextInt();
            int[] lstNum = new int[number]; 
            for(int i = 0;  i<number; i++ )
            {
                System.out.print("Enter Number " + (i+1) + " :-"); 
                lstNum[i] = sc.nextInt(); 
            }
            int temp; 
            for(int j =0 ; j < lstNum.length; j++)
            {
                for(int k = j; k <lstNum.length; k++)
                {
                    if(lstNum[j] < lstNum[k])
                    {
                        temp = lstNum[j]; 
                        lstNum[j] = lstNum[k]; 
                        lstNum[k] =temp; 
                    }
                }
            }
            System.out.println("Second biggest value is::"+lstNum[1]);
        }
    }