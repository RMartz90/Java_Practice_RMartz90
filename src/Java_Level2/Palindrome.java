package Java_Level2;

public class Palindrome {
    public static void main (String[] args){

        String word = "No lemon, no melon";
        word = word.replace(" ", "");

        if (Palindrome(word)){
            System.out.println(word + ": is a palíndrome.");
        } else {
            System.out.println(word + ": is not a palindrome.");
        }
    }
    
    public static boolean Palindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0, j = word.length()/2 - 1; i <= j; i++, j--) {
            if (word.charAt(i) == word.charAt(j))
                return true;}

        return false;

    }
}