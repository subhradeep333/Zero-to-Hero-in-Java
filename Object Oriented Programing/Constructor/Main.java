import java.util.*;


// this is a class which constructor
class Cons1{
    int x;
    int y;


    // paramiterazid constructor
    Cons1(int a, int b){
        x = a;
        y = b;
    }


    // copy constructor
    Cons1(Cons1 c1){
        x = c1.x;
        y = c1.y;
    }
}
public class Main{
    public static void main(String[] args){
        Cons1 c1 = new Cons1(54,78);
        Cons1 c2 = new Cons1(c1);

        System.out.println(c2.x);
        System.out.println(c2.y);
    }

}