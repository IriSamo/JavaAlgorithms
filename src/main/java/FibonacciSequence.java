/**
 * A Fibonacci Series is a sequence of numbers in which next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
 * The first two numbers of fibonacci series are 0 and 1.
 * We can create a Fibonacci series using iterative or recursive methods.
 * We can use the memorization technique to make the program calculate the Fibonacci series faster.
 */

public class FibonacciSequence {


    /**
     * Java program for the Iterative approach
     * Time complexity - O(n)
     * Space complexity - O(1)
     *
     * @param n
     * @return
     */

    public static int fibonacciIterative(int n) {
        int num1 = 0;
        int num2 = 1;
        int nextNum;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            while (n > 0) {
                nextNum = num1 + num2;
                num1 = num2;
                num2 = nextNum;
                n--;
            }
        }
        return num1;
    }

    /**
     * Fibonacci Series Using recursion in Java
     * Time complexity - O(n)
     * Space complexity - O(n)
     *
     * @param n
     * @return
     */

//     We need to create a function so that we can perform recursion. This function takes an integer input.
//     The function checks whether the input number is 0, 1, or 2, and it returns 0, 1, or 1(for 2nd Fibonacci).
//     If the input is greater than 2, the function calls itself recursively for the previous values
//     until the value of the input variable becomes less than or equal to 2.
//     So if the function receives an integer n as input, it will return the nth Fibonacci number.
//     To print the Fibonacci series, we will call this function to compute each Fibonacci number.
    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } // Oth fibonacci is 0

        if (n == 1 || n == 2) {
            return 1;
        } // 1st and 2nd Fibonacci are 1 and 1 only

        // calling function recursively for nth Fibonacci
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }


    // Fibonacci Number Using Memorization in Java

//    It would take too long to calculate the Fibonacci series of a huge length using the recursive method.
//    To solve this problem, we can use the memorization technique to create the Fibonacci Series.
//    It used to improve the performance of recursion programs.
//    In the previous approach, we calculated each Fibonacci number separately.
//    In this technique, the result of the previous calculation is stored (cached) and reused to calculate the next Fibonacci number.


    public static int fibonacciMemorize(int n) {
        int[] memorizeTable = new int[n + 1]; // Initialize the array with size n+1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memorizeTable[n] != 0) {
            // Getting value from the stored result(s)
            return memorizeTable[n];
        }

        int result = fibonacciMemorize(n - 1) + fibonacciMemorize(n - 2);

        // Storing the result in cache
        memorizeTable[n] = result;

        return result;
    }
}