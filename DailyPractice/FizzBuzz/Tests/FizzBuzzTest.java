import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void nonFizzBuzzValuesAreNumbers(){
        assertEquals("1",fizzBuzz(10)[0]);
        assertEquals("7",fizzBuzz(10)[6]);
        assertEquals("11",fizzBuzz(15)[10]);
    }

    @Test
    void divisibleBy3ShouldBeFizz(){
        assertEquals("Fizz",fizzBuzz(10)[2]);
    }

    @Test
    void divisibleBy5ShouldBeBuzz(){
        assertEquals("Buzz",fizzBuzz(10)[4]);
    }

    @Test
    void divisibleBy15ShouldBeFizzBuzz(){
        assertEquals("FizzBuzz",fizzBuzz(20)[14]);
    }

    private String[] fizzBuzz(int limit) {
        String[] output = new String[limit];
        for(int i = 1; i <= limit; i++){
            String result = "";

            if(i % 3 == 0){ result += "Fizz"; }
            if(i % 5 == 0){ result += "Buzz"; }
            if(result.equals("")){ result += i; }

            output[i-1] = result;
        }
        return output;
    }
}
