import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
//
//    @Before
//    public void setup() {
//    fizzBuzz=new FizzBuzz();
//    }

    @Test
   public void testNumber() {
      FizzBuzz  fizzBuzz=new FizzBuzz();
      int number=1;
    String numberReturned=  fizzBuzz.play(number);
    assertEquals("Fizz",numberReturned);
    }

    @Test
    void testFizz() {
        FizzBuzz  fizzBuzz=new FizzBuzz();

        int number=3;
        String numberReturned=  fizzBuzz.play(number);
        assertEquals("Fizz",numberReturned);

    }

    @Test
    void testBuzz() {
        FizzBuzz  fizzBuzz=new FizzBuzz();

        int number=5;
        String numberReturned=  fizzBuzz.play(number);
        assertEquals("Buzz",numberReturned);

    }
    @Test
    void testBuzzDivisibleBy5() {
        FizzBuzz  fizzBuzz=new FizzBuzz();

        int number=10;
        String numberReturned=  fizzBuzz.play(number);
        assertEquals("Buzz",numberReturned);

    }
}
