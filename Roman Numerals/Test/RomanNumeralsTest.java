import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    @Test
    void Zero(){ assertEquals("", toRoman(0)); }

    @Test
    void OneTillThirty(){
        assertEquals("I", toRoman(1));
        assertEquals("XIV", toRoman(14));
        assertEquals("XXII", toRoman(22));
        assertEquals("XXVII", toRoman(27));
        assertEquals("XXXIII", toRoman(33));
    }

    @Test
    void Fourties(){
        assertEquals("XLVI", toRoman(46));
    }

    @Test
    void FiftyToEighty(){
        assertEquals("L",toRoman(50));
        assertEquals("LXIX",toRoman(69));
        assertEquals("LXXXVIII",toRoman(88));
    }

    @Test
    void Ninthies(){
        assertEquals("XC", toRoman(90));
        assertEquals("XCV", toRoman(95));
        assertEquals("XCVIII", toRoman(98));
    }

    @Test
    void Hundreds(){
        assertEquals("C",toRoman(100));
        assertEquals("CCXXXVII",toRoman(237));
        assertEquals("CCCXI",toRoman(311));
    }

    @Test
    void FourHundreds(){
        assertEquals("CD",toRoman(400));
        assertEquals("CDXXXII",toRoman(432));
        assertEquals("CDLXIV",toRoman(464));
    }

    @Test
    void FiveHundreds(){
        assertEquals("DLXXXVII", toRoman(587));
        assertEquals("DCCCXCIII", toRoman(893));
    }

    @Test
    void NineHundreds(){
        assertEquals("DM",toRoman(900));
        assertEquals("DMLXIX", toRoman(969));
        assertEquals("DMXCIV",toRoman(994));
    }

    @Test
    void Thousands(){
        assertEquals("M", toRoman(1000));
        assertEquals("MDCCXXXIV", toRoman(1734));
        assertEquals("MDLII", toRoman(1552));
        assertEquals("MDMXCIX", toRoman(1999));
        assertEquals("MMMDMXCIX", toRoman(3999));
    }

    private String toRoman(int number) {
        String output = ""; //Output Roman Value
        while(number != 0) {
            if (number >= 1000) { number -= 1000; output += "M"; }
            else {
                if (number >= 900) { number -= 900; output += "DM"; }
                if (number >= 500) { number -= 500; output += "D"; }
                if (number >= 400) { number -= 400; output += "CD"; }
                if (number >= 100) { number -= 100; output += "C"; }
                else {
                    if (number >= 90) { number -= 90; output += "XC"; }
                    if (number >= 50) { number -= 50; output += "L"; }
                    if (number > 40) { number -= 40; output += "XL"; }
                    if (number >= 10) { number -= 10; output += "X"; }
                    else {
                        if (number >= 9) { number -= 9; output += "IX"; }
                        if (number >= 5) { number -= 5; output += "V"; }
                        if (number >= 4) { number -= 4; output += "IV"; }
                        if (number >= 1) { number -= 1; output += "I"; }
                    }
                }
            }
        }
        return output;
    }
}