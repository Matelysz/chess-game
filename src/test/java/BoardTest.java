import org.junit.Before;
import org.junit.Test;
import sda.games.chess.Board;
import sda.games.chess.Move;

public class BoardTest {

    Board board = new Board();
  Move move;
    @Test
    public void shouldNotMoveOutOfTheRangeOfBoard(){
        move = new Move("a2>i9");
        board.makeAMove(move);

    }

    @Test
    public void shouldNotMoveIfThereIsPawnInTheWay(){



    }

    @Test
    public void shouldNotMoveIfIsBlocked(){



    }
    @Test
    public void shouldMoveAndCaptureIfPlacedOnOpponentsPawn(){



    }


    @Test
    public void shouldMoveOnFreeSpot(){



    }
}
