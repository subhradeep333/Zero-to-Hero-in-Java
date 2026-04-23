//count frequency of each character in a string
import java.util.*;
public class FreqOfEachChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String in lowercase: ");
        String word = sc.nextLine();
        int[] freq = new int[26];
        for(char ch: word.toCharArray()){
            freq[ch - 'a']++ ;    //ch = a, a-a = 97-97 =0
        }
        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                System.out.println((char)(i+'a') + "  -> " + freq[i]);
            }
        }
    }
}
