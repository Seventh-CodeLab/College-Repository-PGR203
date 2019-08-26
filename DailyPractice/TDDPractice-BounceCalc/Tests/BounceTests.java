import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BounceTests {
    @Test
    void shouldNotBounceFromZero(){
        assertEquals(0,countBounce(0, 2, 0.6));
        assertEquals(0,countBounce(0, 2, 0.2));
    }

    @Test
    void shouldCheckFirstFall(){
        assertEquals(1,countBounce(10,2, 0.1));
        assertEquals(0,countBounce(3,5,0.7));
    }

    @Test
    void shouldNotBeInfinite(){
        assertEquals(-1, countBounce(10,2,5));
        assertEquals(-1, countBounce(10,2,-3));
    }

    @Test
    void smallBounceTest(){
        assertEquals(5,countBounce(10,2,.5));
    }

    @Test
    void largeBounceTest(){
        assertEquals(43,countBounce(10,1,.9));
    }

    @Test
    void shouldAccountForExactHits(){
        //If the height perfectly aligns with the marker, it should count only one pass.
        assertEquals(2,countBounce(10,5,.5));
        assertEquals(4,countBounce(10,2.5,.5));
    }


    // The purpose of this program is to count how many times a bouncing object passes a marker.
    // It is meant to count every pass going up and down until its bounce height can no longer reach the marker
    // The object must lose some height with each bounce, and this should be accounted for.

    // Height: The falling object's starting height.
    // Marker: The height the object passes for the counter to increment

    private int countBounce(double height, double marker, double loss) {
        if(loss >= 1 || loss < 0){ return -1; }

        int bounces = 0;
        if(height > marker){
            bounces++;
            height *= loss;
        }
        while(height >= marker){
            if(height == marker){
                bounces++;
                break;
            }
            height *= loss;
            bounces += 2;
        }
        return bounces;
    }
}
