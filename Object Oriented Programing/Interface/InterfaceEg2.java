/* 
 * Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
*/
interface Resizable{
   void resizeWidth(int width);
   void resizeHeight(int height);
}
class Rectangle101 implements Resizable{
    int width,height;
    Rectangle101(int width,int height){
        this.height=height;
        this.width=width;
    }
    void displaySize(){
        System.out.println("Height : "+height+"\nWidth : "+width);
    }
    public void resizeWidth(int width){
        this.width=width;
    }
    public void resizeHeight(int height){
        this.height=height;
    }
}
public class InterfaceEg2 {
    public static void main(String[] args) {
        Rectangle101 ob=new Rectangle101(5, 6);
        ob.displaySize();
        ob.resizeHeight(8);
        ob.resizeWidth(9);
        ob.displaySize();
    }
}
