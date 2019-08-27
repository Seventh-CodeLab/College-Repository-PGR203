import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinesweepTest {
    @Test
    void shouldShowMinesweeperBoard() {
        Assertions.assertArrayEquals(new String[] {
                        "1100000000",
                        "*311000111",
                        "*3*10112*2",
                        "121101*22*",
                        "1100011111",
                        "*210000000",
                        "2*21100000",
                        "123*100000",
                        "01*2100000",
                        "0111000000"
                },
                new Minesweeper(new String[]{
                        "..........",
                        "*.........",
                        "*.*.....*.",
                        "......*..*",
                        "..........",
                        "*.........",
                        ".*........",
                        "...*......",
                        "..*.......",
                        ".........."
                }).calculateHints());
    }
}
