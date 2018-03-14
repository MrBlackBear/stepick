package basicSyntaxJava;

import java.math.BigInteger;

public class EighthTask {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        if (value == 1) {
            return new BigInteger(new String("1"));
        }
        String str = value + "";
        return new BigInteger(str).multiply(factorial(value - 1));
    }
}
