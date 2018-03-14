package basicSyntaxJava;

public class SeventhTask {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^A-Za-z0-9]+", "").toUpperCase();
        StringBuilder str2 = new StringBuilder(str);
        return str.equals(str2.reverse().toString());
    }
}
