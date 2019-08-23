import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddTest {
    @Test
    void twoShouldBeEven() {
        assertTrue(isEven(2));
    }

    @Test
    void threeShouldBeOdd(){
        assertFalse(isEven(3));
    }

    @Test
    void oneShouldBeOdd(){
        assertFalse(isEven(1));
    }

    @Test
    void zeroShouldBeEven(){
        assertTrue(isEven(0));
    }

    @Test
    void shouldHandleNegatives(){
        assertFalse(isEven(-3));
        assertFalse(isEven(-1));
        assertTrue(isEven(-2));
        assertFalse(isEven(-5));
        assertTrue(isEven(-4));
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}
