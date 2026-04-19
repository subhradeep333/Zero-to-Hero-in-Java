/*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.*/

import java.util.Scanner;
abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats like it's a royal feast");
    }
    void sleep(){
        System.out.println("Lion sleeps like he pays the jungle's rent");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger eats like a chef");
    }
    void sleep(){
        System.out.println("Tiger sleeps like he's the boss of napping");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer sleeps like it borrowed time");
    }
    void sleep(){
        System.out.println("A deer eats like it's in a jungle version of Squid Game");
    }
}
class behavior{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lion ob=new Lion();
        Tiger ob1=new Tiger();
        Deer ob2=new Deer();
        while(true){
            System.out.println("1 for Lion");
            System.out.println("2 for Tiger");
            System.out.println("3 for Deer");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    ob.eat();
                    ob.sleep();
                    break;
                case 2:
                    ob1.eat();
                    ob1.sleep();
                    break;
                case 3:
                    ob2.eat();
                    ob2.sleep();
                    break;
                default:
                    return;
                }
        }
    }
}