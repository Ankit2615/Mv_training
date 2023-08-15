class demo_1{
    void print(){
        System.out.println("Hello user"); 
    }
}
class demo_2 extends demo_1{
    void print_data(String usr){
        System.out.println(", Goood morning " + usr);
    }
}

class demo_3 extends demo_2{
    void data(String data){
        System.out.println("Your Data  is :- " +cl data); 
    }
}
class  java_1{
    public static void main(String args []){
        System.out.println("Write a program for Multilevel Inheritance using java programming language.
        ");
        demo_3 obj3 = new demo_3(); 
        obj3.print(); 
        obj3.print_data("Ankit");
        obj3.data("Hey how are u ?"); 
    }
}