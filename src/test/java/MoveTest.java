import org.junit.Before;
import org.junit.Test;
import sda.games.chess.Move;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {

    @Test
    public void inputIsALowerCaseLetters() {
        Move move = new Move("a1>b2");
        assertEquals("fromX = 0, fromY = 0, toX = 1, toY = 1", move);
    }

}
