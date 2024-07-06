package Java1;

public class listaPalindromo {
    public static void main(String[] args) {
        String[] words = {"reconocer", "casa", "radar", "java", "oso"};

        for (String word : words) {
            if (isaPalindrome(word)){
                System.out.println(word + " is a palíndrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }

    public static boolean isaPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0, j = word.length() - 1; i <= j; i++, j--) {

            if (word.charAt(i) == word.charAt(j))
                return true;}

        return false;
    }
}
