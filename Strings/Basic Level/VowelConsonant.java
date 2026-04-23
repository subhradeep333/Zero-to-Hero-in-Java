//Count vowels and consonants in a String
import java.util.*;
public class VowelConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String word = sc.nextLine().trim();
        int countVowel = 0;
        int countConso = 0;

        for(int i = 0; i< word.length(); i++){
            char ch = Character.toLowerCase(word.charAt(i));

            if(Character.isLetter(ch)){
                //"aeiou".contains(String.valueOf(ch))
                if(("aeiou".indexOf(ch) != -1)){
                    countVowel++;
                }
                else{
                    countConso++;
                }
            }
        }
        System.out.printf("vowels: %d\nConsonants: %d", countVowel, countConso);
    }
}