import org.junit.Test;
import sda.games.chess.Move;
import sda.games.chess.Pawn;
import sda.games.chess.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {

  @Test
    public void ShouldToGoForward(){
      Pawn pawn = new Pawn();
      Move move = new Move("b1>b2");
      assertThat(pawn.isMoveValid(move)).isTrue();
  }

     @Test
    public void ShouldNotToGoMoreThanTwoPlaces() {
        Pawn pawn = new Pawn();
        Move move = new Move("b2>b4");
        assertThat(pawn.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldGoToNorthEast() {
        Pawn pawn = new Pawn();
        Move move = new Move("b6>c7");
        assertThat(pawn.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldNotToGoRight() {
        Pawn pawn = new Pawn();
        Move move = new Move("b6>c6");
        assertThat(pawn.isMoveValid(move)).isFalse();
    }
}
