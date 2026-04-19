/*
 * Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes
 */
interface Drawable{
    void draw();
}
class Circles implements Drawable{
    public void draw(){
        System.out.println("Circle is drawn");
    }
}
class Rectangle102 implements Drawable{
    public void draw(){
        System.out.println("Rectangle is drawn");
    }
}
class Triangles1 implements Drawable{
    public void draw(){
        System.out.println("Triangle is drawn");
    }
}
public class InterfaceEg3 {
    public static void main(String[] args) {
        Circles ob=new Circles();
        ob.draw();
        Rectangle102 ob2=new Rectangle102();
        ob2.draw();
        Triangles1 ob3=new Triangles1();
        ob3.draw();
    }
}
