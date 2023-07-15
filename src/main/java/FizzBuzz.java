/**
 * Java Program to solve FizzBuzz problem
 *
 * @author SIri
 */
public class FizzBuzz {

    /**
     * Java Method to solve FizzBuzz problem, which states that program
     * should print Fizz if number is multiple of 3,
     * print Buzz if number is multiple
     * of 5, and print FizzBuzz if number is multiple of both 3 and 5
     *
     * @param number
     * @return String
     */
    public static String fizzBuzz(int number) {

        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    /**
     * Another version of solution of FizzBuzz problem.
     *
     * @Params: array of numbers
     * @Returns: String
     */
    public static String fizzBuzz(int[] number) {
        StringBuilder result = new StringBuilder();

        for (int j : number) {
            if (j % 15 == 0) {
                result.append("FizzBuzz ");
            } else if (j % 5 == 0) {
                result.append("Buzz ");
            } else if (j % 3 == 0) {
                result.append("Fizz ");
            } else {
                result.append(j).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(30));
        System.out.println(fizzBuzz(new int[] {1, 15, 30, 5, 4, 3, 9, 6, 7}));
    }
}
