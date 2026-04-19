abstract class A1{
    abstract void show();
    void display(){

    }
}
class B1 extends A1{
    void show()
    {
        System.out.println("show method");
    }
    void display(){
        System.out.println("display function");
    }
}
public class AbstractClassEx {
    public static void main(String args[]) {
        B1 ob = new B1();
        ob.show();
        ob.display();
    }
}
