import java.util.*;
public class Pallindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String word = sc.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(
            (word.equals(reversed)) ? "pallindrome" : "not pallindrome"
        );
    }
}