public class ReverseArray {

    /**
     * A Java program to reverse an array.
     */

    public static int[] reverseArray(int[] array) {
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return array;
        }
        return new int[0];
    }
}
