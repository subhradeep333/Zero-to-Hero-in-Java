//To find the first non repeating character in the String 
import java.util.* ;
public class FirstNonRepeatingChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[26];

        for(char ch: str.toCharArray()){
            if (ch >= 'a' && ch <='z'){
                freq[ch - 'a']++ ;
            }
        }

        boolean found = false;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch<= 'z' && freq[ch - 'a'] == 1){
                System.out.println("First non repeating character is "+ str.charAt(i));
                found = true;
                break;
            }
        }
        if (found == false){
                System.out.println("All chararacters are repeated");
            }
    }
}