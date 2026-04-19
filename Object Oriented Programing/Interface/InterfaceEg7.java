/*
 * Using interface where interface extends another interface
 */
interface A3{
    void display();
}
interface B3 extends A3{
    void greet();
}
class GoingThrough implements B3{
    public void display(){
        System.out.println("Hellow");
    }
    public void greet(){
        System.out.println("Good Afternoon...");
    }
}
public class InterfaceEg7 {
    public static void main(String[] args) {
        GoingThrough ob=new GoingThrough();
        ob.display();
        ob.greet();
    }
}
