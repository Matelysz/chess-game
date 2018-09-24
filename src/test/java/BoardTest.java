import org.junit.Before;
import org.junit.Test;
import sda.games.chess.*;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    Board board = new Board();
  Move move;
  Player player1 = new Player(Color.WHITE);
    @Test
    public void shouldNotMoveOutOfTheRangeOfBoard(){
        move = new Move("a2>i9");
        board.makeAMove(move, player1);

    }

  @Test
  public void shouldNotMoveFromEmptySpot(){
    move = new Move("a3>a4");
    assertThat(board.makeAMove(move, player1)).isFalse();

  }

    @Test
    public void shouldNotMoveIfThereIsPawnInTheWay(){
      move = new Move("a1>a3");
      assertThat(board.makeAMove(move, player1)).isFalse();



    }

    @Test
    public void shouldNotMoveIfIsBlocked(){



    }
    @Test
    public void shouldMoveAndCaptureIfPlacedOnOpponentsPawn(){



    }


    @Test
    public void shouldMoveOnFreeSpot(){

      move = new Move("a2>a3");
      assertThat(board.makeAMove(move, player1)).isTrue();

    }
}
