package basicSyntaxJava;

public class FirstTask {
    public static boolean booleanExpressionMy(boolean a, boolean b, boolean c, boolean d) {
        int i = 0;
        if (a == true) {
            i++;
        }
        if (b == true) {
            i++;
        }
        if (c == true) {
            i++;
        }
        if (d == true) {
            i++;
        }
        return i == 2;
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a != b) && (c != d)) || ((a != c) && (b != d));
    }
}
