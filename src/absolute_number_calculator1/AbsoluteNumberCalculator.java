package absolute_number_calculator1;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        if (number < 0) {
            return (-number);
        }
        return number;
    }
}
