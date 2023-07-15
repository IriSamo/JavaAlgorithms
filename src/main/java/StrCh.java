public class StrCh {

    public static int countOccurrences(String str, char ch) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static int countOccurrencesIgnoreCase(String str, char ch) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(ch))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countOccurrencesCh(String str, char ch) {
        int counter = 0;

        if (str.substring(str.length() - 1).equalsIgnoreCase(String.valueOf(ch))) {
            counter++;
        }
//        System.out.println(str.substring(str.length() - 1));
        for (int i = str.length() - 2; i >= 0; i--) {
//            System.out.println(str.substring(i, i + 1));
            if (str.substring(i, i + 1).equalsIgnoreCase(String.valueOf(ch))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("Мoммoм", 'м'));
        System.out.println(countOccurrencesIgnoreCase("Мoммoм", 'м'));
        System.out.println(countOccurrencesCh("Мoммoм", 'м'));
    }
}
