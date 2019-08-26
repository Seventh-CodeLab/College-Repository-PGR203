import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComputeSum {
    @Test
    void shouldGive10(){
        assertEquals(10, summarize(1,2,3,4));
    }

    @Test
    void shouldGive30(){
        assertEquals(30, summarize(15,10,5));
    }

    @Test
    void shouldHandleNegatives(){
        assertEquals(-100, summarize(-50,-10,-10,-10,-10,-10));
    }

    //Summarize the numbers in a for-loop
    private int summarize(int... arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
