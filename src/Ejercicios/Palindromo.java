package Ejercicios;

public class Palindromo {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < charArray.length; i++, j--) {

            if (charArray[i] != charArray[j]) {
                return false;
            }
        }
        return true;
    }
}
