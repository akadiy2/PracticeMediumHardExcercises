import java.util.stream.Stream;

public class BreakAPalindrome {

    public static void main (String [] args) {
        Stream.of("aa", "a", "abcdcba", "", "abccba").forEach(str -> System.out.println(breakPalindrome(str)));
    }

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