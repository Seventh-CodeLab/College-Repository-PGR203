import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
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

    private String toRoman(int number) {
        String romanNum = ""; //Output

        String append = "";
        while(number != 0) {

            // Above 100
            if (number >= 100) {
                number -= 100;
                append += "C";
            } else {

                // Above 90
                if (number >= 90) {
                    number -= 90;
                    append += "XC";
                }

                //  Above 50
                if (number >= 50) {
                    number -= 50;
                    append += "L";
                }

                // Above 40
                if (number > 40) {
                    number -= 40;
                    append += "XL";
                }

                //Above 10
                if (number >= 10) {
                    number -= 10;
                    append += "X";
                }

                // Below 10
                if (number <= 10) {
                    if (number >= 5 && number < 9) {
                        number -= 5;
                        append += "V";
                    }
                    if (number % 5 > 0 && number < 4) {
                        number -= 1;
                        append += "I";
                    }
                    if (number == 4) {
                        number -= 4;
                        append += "IV";
                    }
                    if (number == 9) {
                        number -= 9;
                        append += "IX";
                    }
                }
            }
        }
        romanNum += append;

        return romanNum;
    }
}