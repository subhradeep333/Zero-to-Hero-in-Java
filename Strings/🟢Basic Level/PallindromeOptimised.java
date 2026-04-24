//pallindrome check using 2 pointers
import java.util.*;
public class PallindromeOptimised{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String word = sc.nextLine();
        int left = 0;
        int right = word.length() - 1;
        boolean isPallindrome = true;
        while(left < right){
           if (word.charAt(left) != word.charAt(right)){
                isPallindrome = false;
                break;
           }
           left++ ;
           right-- ;
        }
        System.out.println(
            (isPallindrome) ? "pallindrome" : "not pallindrome"
        );
    }
}