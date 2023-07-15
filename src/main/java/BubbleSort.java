import java.util.Arrays;

/**
 * Java Program that implements Bubble Sort algorithm
 *
 * @author SIri
 */
public class BubbleSort {

    /**
     * Java Method that implements Bubble Sort algorithm
     *
     * @param array
     * @return array
     */
    public static int[] bubbleSort(int[] array) {
        int temp;

        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j] < array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
            return array;
        }
        return array;
    }
}