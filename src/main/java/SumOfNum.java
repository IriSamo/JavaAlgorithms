public class SumOfNum {

    public static int sumOfNum(int n) {
        int sum = 0;

        if (n > 0) {
            if (n > 9) {
                sum = n % 9;
                if (sum == 0) {
                    sum = 9;
                }
            } else sum = n;

        } else {
            sum = -1;
        }
        return sum;
    }
}
