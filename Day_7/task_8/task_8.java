import java.util.*; 
class task_8{
    public static void main(String args []){
        int rows,cols;  
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter odd numbers for rows and colums to get perfect Swastika"); 
        System.out.print("Enter Total rows :- "); 
        rows = sc.nextInt();  
        System.out.print("Enter total cols :- "); 
        cols = sc.nextInt(); 

        desingPattern(rows,cols); 
    }
    // create a pattern 
    static void  desingPattern(int rows, int cols){
        for(int u =0; u< rows; u++){
            for(int v = 0; v <cols; v++){
                // chek  u is less thamn from half of row or not
                if(u < rows / 2){
                    // check whether v is less than from half of cols or not  
                    if(v < cols / 2){
                        if(v == 0){
                            System.out.print("* "); 
                        }else{
                            System.out.print(" " +" ");                         
                        }
                    }
                    //checks if v is equals to half of cols or not 
                    else if(v == cols/2){
                        System.out.print("* "); 
                    }else{
                        // u = 0 denotes 1st row that will have '*'  
                        if(u == 0){
                            System.out.print("* ");
                        }
                    }
                }
                // check whether u is equal to half of rows or not
                 else if (u == rows / 2) {  
                    System.out.print("* ");  
                }  
                else  
                {  
                    // When u > rows/2, the middle and last column will have '*'  
                    if (v == cols / 2 || v == cols - 1)  
                    {  
                        System.out.print("* ");  
                    }  
                    else if (u == rows - 1)  
                    {   
                        // if v <= cols/2 OR if it is last column, the last row will be have '*'  
                        if (v <= cols / 2 || v == cols - 1)   
                        {  
                            System.out.print("* ");  
                        }  
                        else {  
                            System.out.print(" "+ " ");  
                        }  
                    }  
                    else  
                    System.out.print(" "+" ");  
                }
            }
            System.out.print("\n");   
        }
    }
}