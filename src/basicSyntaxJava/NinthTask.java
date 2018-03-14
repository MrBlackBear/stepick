package basicSyntaxJava;

public class NinthTask {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int lengthAll = a1.length + a2.length;
        if (a1.length == 0) {
            return a2;
        }
        if (a2.length == 0) {
            return a1;
        }
        int firstCount = 0;
        int secondCount = 0;
        int[] result = new int[lengthAll];
        while (firstCount + secondCount < lengthAll) {
            if (firstCount >= a1.length) {
                result[secondCount + firstCount] = a2[secondCount];
                secondCount++;
                continue;
            }
            if (secondCount >= a2.length) {
                result[firstCount + secondCount] = a1[firstCount];
                firstCount++;
                continue;
            }
            if (a1[firstCount] < a2[secondCount]) {
                result[firstCount + secondCount] = a1[firstCount];
                firstCount++;
            } else {
                result[secondCount + firstCount] = a2[secondCount];
                secondCount++;
            }
        }
        return result; // your implementation here
    }
}
