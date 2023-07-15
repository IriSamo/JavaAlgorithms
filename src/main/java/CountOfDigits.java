public class CountOfDigits {

// **
// Write a Java program that reads a positive integer and count the number of digits.

    public static int countOfDigits(long n) {
        int count = 0;

        if (n > 0) {
            while (n > 0) {
                ++count;
                n /= 10;
            }
        }
        else if ( n == 0){
            count = 1;
        }
        else {
            count = -1;
        }
        return count;
    }
}