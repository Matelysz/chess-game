import org.junit.Test;
import sda.games.chess.Move;

import static org.junit.Assert.assertEquals;


public class MoveTest {

    @Test
    public void inputIsALowerCaseLetter() {
        Move move = new Move("a1>b2");
        assertEquals(1 , move.getFromX());
    }

    @Test
    public void inputIsAUpperCaseLetter() {
        Move move = new Move("A1>B2");
        assertEquals(1 , move.getFromX());
    }

    @Test
    public void onSecondPlaceIsALetter() {
        Move move = new Move("A1>B2");
        assertEquals(1 , move.getFromY());
    }

//    @Test
//    public void inputStringIsShorterThan5CharsLength() {
//        Move move = new Move("A1>");
//        assertEquals(wyjatek);
//    }
//
//    @Test
//    public void inputStringIsLongerThan5CharsLength() {
//        Move move = new Move("A1>B2A1>B2");
//        assertEquals(wyjatek);
//    }



}
