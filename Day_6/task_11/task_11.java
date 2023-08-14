interface My_cat{
    void cat(); 
}
interface My_dog{
    void dog(); 
}
class Animal implements My_cat,My_dog{
    public void dog(){
        System.out.println("it's from the dog method"); 
    }
    public void cat(){
        System.out.println("it's from the cat method"); 
    }
}
public class task_11 {
    public static void main(String args []){
        Animal a1 = new Animal(); 
        a1.cat(); 
        a1.dog(); 
    }
}