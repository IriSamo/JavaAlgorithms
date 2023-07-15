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
    public static String sortString1(String string) {

        char[] tempArray = string.toCharArray();// Converting input string to character array

        Arrays.sort(tempArray); // Sorting temp array using

        return new String(tempArray);// Returning new sorted string
    }

    /**
     * Java Method that implements String Sorting algorithm by using Bubble Sort algorithm
     *
     * @param string
     * @return String
     */
    public static String sortString(String string) {
        char temp;

        char[] array = string.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(sortString1("SortAString"));
        System.out.println(sortString("SortAString"));
    }
}
