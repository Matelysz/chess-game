import org.junit.Test;
import sda.games.chess.Color;
import sda.games.chess.Move;
import sda.games.chess.Pawn;
import sda.games.chess.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {


  @Test
    public void ShouldToGoForwardForWhite(){
      Pawn pawn = new Pawn(Color.WHITE);
      Move move = new Move("a2>a3");
      assertThat(pawn.isMoveValid(move)).isTrue();
  }

    @Test
    public void ShouldToGoForwardForBlack(){
        Pawn pawn = new Pawn(Color.WHITE);
        Move move = new Move("d5>d3");
        assertThat(pawn.isMoveValid(move)).isTrue();
    }

     @Test
    public void ShouldNotToGoMoreThanTwoPlacesForWhite() {
        Pawn pawn = new Pawn(Color.WHITE);
        Move move = new Move("b2>e4");
        assertThat(pawn.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldGoToNorthEastForWhite() {
        Pawn pawn = new Pawn(Color.WHITE);
        Move move = new Move("b6>a7");
        assertThat(pawn.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldNotToGoRight() {
        Pawn pawn = new Pawn(Color.WHITE);
        Move move = new Move("b6>c6");
        assertThat(pawn.isMoveValid(move)).isFalse();
    }
}
