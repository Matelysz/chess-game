import org.junit.Test;
import sda.games.chess.Move;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {

    @Test
    public void inputIsALowerCaseLetters() {
        Move move = new Move("a1>b2");
        assertEquals(1 , move.getFromX());
    }

}
