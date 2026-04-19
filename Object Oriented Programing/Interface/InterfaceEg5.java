/*Create a Java program to demonstrate a class implementing multiple interfaces
Flyable is an interface that declares a method fly().
Swimmable is an interface that declares a method swim().
Bird is a class that implements both Flyable and Swimmable interfaces. It provides implementations for both fly() and swim() methods. 
*/
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class bird implements Flyable,Swimmable{
    public void fly(){
        System.out.println("The bird can fly🪰");
    }
    public void swim(){
        System.out.println("The bird cannot swim🏊🏻");
    }
}
public class InterfaceEg5 {
    public static void main(String[] args) {
        bird ob=new bird();
        ob.fly();
        ob.swim();
    }
}
