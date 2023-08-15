import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {

        int no1,no2,c;
        int fact1=1,fact2=1,fact3=1;
        double pn,cn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no1");
        int a=sc.nextInt();
        System.out.println("Enter the no2");
        int b=sc.nextInt();
        if(a>b||(a==b))
        {
            no1=a;
            no2=b;
        }
        else
        {
            no1=b;
            no2=a;
        }
        c=no1-no2;
        for(int i=no1;i>0;i--)
        {
            fact1*=i;
        }
        for(int i=c;i>0;i--)
        {
            fact2*=i;
        }
        for(int i=no2;i>0;i--)
        {
            fact3*=i;
        }
        
        pn=fact1/fact2;
        cn=pn/fact3;
        System.out.println("permutation of "+no1+" and "+no2+" is "+pn);
        System.out.println("combination of "+no1+" and "+no2+" is "+cn);
    }
}
