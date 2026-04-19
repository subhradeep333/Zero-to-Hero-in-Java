interface Calc{
    void area();
    void perimeter();
}
class Rectangle implements Calc{
    int l,b;
    void input(int l, int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area is="+(l*b));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is="+(2*(l+b)));
    }
}
class rect extends Rectangle{
    int radius=5;

    @Override
    public void area() {
        System.out.println("Area of circle is : "+Math.PI*radius*radius);
    }
}
class InterfaceEx{
    public static void main(String args[])
    {
        rect r=new rect();
        r.input(3,4);
        r.area();
        r.perimeter();
    }
}
