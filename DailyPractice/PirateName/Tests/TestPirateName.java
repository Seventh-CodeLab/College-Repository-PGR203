import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPirateName {
    @Test
    void bobShouldBeBobobob(){
        assertEquals("Bobobob",toPirate("Bob"));
    }

    @Test
    void kristerShouldBeKokrorisostoteror(){
        assertEquals("Kokrorisostoteror", toPirate("Krister"));
    }

    @Test
    void tommyShouldBeTotomommomy(){
        assertEquals("Totomommomy", toPirate("Tommy"));
    }

    @Test
    void handleFullCaps(){
        assertEquals("Momarorcocinon", toPirate("MARCIN"));
        assertEquals("Inongogroridod", toPirate("INGRID"));
    }

    private String toPirate(String input) {
        String pirateName = ""; //Build a new string to return

        //Iterate through given input
        for(int i = 0; i < input.length(); i++){
            char a = input.charAt(i); //Shorter variable for character specification

            // As long as it's NOT a vowel
            if(!isVowel(input.charAt(i))){
                //Set the first capital letter
                if(i == 0){
                    pirateName += Character.toUpperCase(a) + "o" + Character.toLowerCase(a);
                } else {
                    pirateName += Character.toLowerCase(a) + "o" + Character.toLowerCase(a);
                }
            } else {
                //Vowels are just put into the string
                if(i == 0){
                    //Handle first letter being a vowel
                    pirateName += Character.toUpperCase(a);
                } else {
                    pirateName += Character.toLowerCase(a);
                }
            }
        }
        return pirateName;
    }

    //External method to test if a character is a vowel or not
    private boolean isVowel(char letter){
        letter = Character.toLowerCase(letter);
        switch (letter){
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                return true;
            default:
                return false;
        }
    }
}
