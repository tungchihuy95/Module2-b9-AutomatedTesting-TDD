package fizzbuzz_result;

public class FizzBuzzResult {
    public static String displayFizzBuzz(int number) {
        if (number < 0) {
//            throw new UnsupportedOperationException();
            return "Invalid Number";
        } else if (number % 3 == 0 && number % 5 != 0) {
            return "Fizz";
        } else if (number % 5 == 0 && number % 3 != 0) {
            return "Buzz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(number);
        }
    }
}
