//Find the frequency of each character in a string using arrays. 
import java.util.*;
public class FreqUsingArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String words = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0; i<words.length(); i++){
            freq[words.charAt(i)]++ ;
        }
        for(int i=0; i<words.length(); i++){
            if(words.charAt(i) !=' ' && freq[words.charAt(i)]>0){
                System.out.println(words.charAt(i) + "--> "+ freq[words.charAt(i)]);
            }
            freq[words.charAt(i)] = 0; 
            //change the frequency of that letter to 0, if printed once --> distinct letters printed, no repetition 
        }
        sc.close();
    }
}