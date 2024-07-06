package Java1;

public class Palindromo {
    public static void main (String[] args){

        String Word = "anita lava la tina";
        Word = Word.replace(" ", "");
        System.out.println("is the word " + Word + " is a Palindrome?? A: " + Palindrome(Word));

    }
    public static boolean Palindrome (String Word) {
        Word = Word.toLowerCase();

        for (int i = 0, j = Word.length()/2 - 1; i <= j; i++, j--) {

            if (Word.charAt(i) == Word.charAt(j))
                return true;}

        return false;

    }
}