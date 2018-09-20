import org.junit.Before;
import org.junit.Test;
import sda.games.chess.BoardGenerator;
import sda.games.chess.Spot;

import static org.junit.Assert.assertEquals;

public class BoardGeneratorTest {

    BoardGenerator boardGenerator = new BoardGenerator();
    Spot[][] spots = new Spot[9][9];

    @Before
    public void main() {
        spots = boardGenerator.generateBoard();
    }

    @Test
    public void onA2ShouldBePawn() {
        assertEquals("Pawn", spots[1][2].getFigure().toString().substring(16, 20));
    }

    @Test
    public void A3shouldBeEmpty() {
        assertEquals(true, spots[1][3].isEmpty());
    }

}
