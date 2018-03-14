package basicSyntaxJava;

public class SixthTask {
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        int number = 0;
        for (int i = 0; number <= Math.abs(value); i++) {
            number = (int) Math.pow(2, i);
            if (number == Math.abs(value)) {
                return true;
            }
        }
        return false;
    }
}
