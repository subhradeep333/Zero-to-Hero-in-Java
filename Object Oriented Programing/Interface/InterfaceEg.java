/*
 * Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */
interface Shapes{
    void getArea();
}
class Rectangle1 implements Shapes{
    int l,b;
    void input(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void getArea(){
        System.out.println("Area of Rectangle is : "+(l*b));
    }
}
class circles implements Shapes{
    int radius;
    void input(int radius){
        this.radius=radius;
    }
    public void getArea(){
        System.out.println("Area of circle : "+Math.floor((Math.PI*(Math.pow(radius,2)))));
    }
}
class Triangles implements Shapes{
    int base,height;
    void input(int base,int height){
        this.base=base;
        this.height=height;
    }
    public void getArea(){
        System.out.println("Area of the triangles : "+(.5*(base*height)));
    }
}
class InterfaceEg {
    public static void main(String[] args) {
        Triangles ob=new Triangles();
        ob.input(5,6);
        ob.getArea();
        circles ob1=new circles();
        ob1.input(5);
        ob1.getArea();
        Rectangle1 ob2=new Rectangle1();
        ob2.input(5,6);
        ob2.getArea();
    }    
}