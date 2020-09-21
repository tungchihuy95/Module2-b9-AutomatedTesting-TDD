package fizzbuzz_result;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzResultTest {

    @Test
    void testFizzBuzz1() {
        int number = -1;

        String expected = "Invalid Number";
        String result = FizzBuzzResult.displayFizzBuzz(number);
        assertEquals(expected, result );
    }

    @Test
    void testFizzBuzz2() {
        int number = 9;

        String expected = "Fizz";
        String result = FizzBuzzResult.displayFizzBuzz(number);
        assertEquals(expected, result );
    }

    @Test
    void testFizzBuzz3() {
        int number = 10;

        String expected = "Buzz";
        String result = FizzBuzzResult.displayFizzBuzz(number);
        assertEquals(expected, result );
    }

    @Test
    void testFizzBuzz4() {
        int number = 30;

        String expected = "FizzBuzz";
        String result = FizzBuzzResult.displayFizzBuzz(number);
        assertEquals(expected, result );
    }

    @Test
    void testFizzBuzz5() {
        int number = 11;

        String expected = "11";
        String result = FizzBuzzResult.displayFizzBuzz(number);
        assertEquals(expected, result );
    }

}