import java.util.Arrays;

/**
 * Java Program that implements String Sorting
 *
 * @author SIri
 */
public class SortAString {

    /**
     * Java Method that implements String Sorting algorithm by converting the string to
     * an array and using the built-in sorting method for arrays.
     *
     * @param string
     * @return String
     */
    public static String sortStringWithArraysSort(String string) {

        char[] array = string.toCharArray();// Convert the input string into a char array

        Arrays.sort(array); // Sort the char array

        return new String(array);// Convert the sorted array back to a String
    }

    /**
     * Java Method that implements String Sorting algorithm by using Bubble Sort algorithm
     *
     * @param string
     * @return String
     */
    public static String sortStringWithBubbleSort(String string) {
        char temp;

        char[] array = string.toCharArray(); //Convert the input string into a char array

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return new String(array); // Convert the sorted array back to a String
    }
}
