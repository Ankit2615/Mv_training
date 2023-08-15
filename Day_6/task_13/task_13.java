import java.util.Scanner;

public class task_13{

    public static void main(String[] args) {
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String ciphertext = sc.nextLine();
        while(a){
        System.out.println("Enter e to encrypt and d to decrypt");
        String c = sc.next();
        char[] arr = ciphertext.toCharArray();
        StringBuffer s = new StringBuffer("");
        switch(c){
            case "e":
            for (char d : arr) {
                d += 5;
                s.append(d);
            }
            break;
            case "d":
            for (char d : arr) {
                d -= 5;
                s.append(d);
                a = false;
            }
            break;
        }
        System.out.println(s);
        ciphertext = s.toString();
    }
    }
}