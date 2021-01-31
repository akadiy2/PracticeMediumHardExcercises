import java.util.stream.Stream;

public class BreakAPalindrome {

    public static void main (String [] args) {
        Stream.of("aa", "a", "abcdcba", "", "abccba").forEach(str -> System.out.println(breakPalindrome(str)));
    }

    /**
     * Medium Level Exercise:
     * Given a palindromic string palindrome,
     * replace exactly one character by any lowercase English letter
     * so that the string becomes the lexicographically smallest possible string that isn't a palindrome.
     *
     * After doing so, return the final string.  If there is no way to do so, return the empty string.
     * @param palindrome
     * @return the palindrome with the replaced character that makes it not a palindrome.
     */
    public static String breakPalindrome(String palindrome) {
        if (palindrome.isEmpty() || palindrome.length() == 1) {
            return "";
        }

        int i = 0;
        int j = palindrome.length() - 1;
        int indexToReplace = -1;

        while (i < j) {
            char c = palindrome.charAt(i);

            if (c != 'a') {
                indexToReplace = i;
                break;
            }

            i++;
            j--;
        }


        char [] strarr = palindrome.toCharArray();

        if (indexToReplace == -1) {
            strarr[strarr.length - 1] = 'b';

        } else {

            for (int index = 0; index < strarr.length; index++) {
                if (index == indexToReplace) {
                    strarr[index] = 'a';
                    break;
                }
            }
        }

        return new String(strarr);


    }
}
