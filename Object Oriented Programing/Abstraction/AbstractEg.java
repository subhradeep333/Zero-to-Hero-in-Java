/*
* Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
* Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
* */
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void calculateArea(){
        System.out.println("The area of circle is "+Math.floor((Math.PI*Math.pow(radius,2))));
    }
    void calculatePerimeter() {
        System.out.println("The perimeter of circle is " + Math.floor((Math.PI * 2 * radius)));
    }
}
class triangle extends Shape{
    int a,b,c;
    triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void calculateArea(){
        System.out.println("Area of triangle is "+a+b+c);
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of triangle is : " + a + b + c / 2);
    }
}
class call{
    public static void main(String[] args) {
        triangle ob=new triangle(3,4,6);
        Circle ob1=new Circle(6);
        ob.calculatePerimeter();
        ob.calculateArea();
        ob1.calculatePerimeter();
        ob1.calculateArea();
    }
}