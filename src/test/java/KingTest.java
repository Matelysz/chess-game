import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sda.games.chess.King;
import sda.games.chess.Move;
import sda.games.chess.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class KingTest {
 private King king =new King();



  @Test
    public void shouldAllowMovingDown(){

    Move move = new Move("b2>b3");
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingUp(){

    Move move = new Move("b3>b2");
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingRight(){

    Move move = new Move("b3>c3");
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingLeft(){

    Move move = new Move("b2>a2");
    assertThat(king.isMoveValid(move)).isTrue();
  }


  @Test
  public void shouldAllowMovingUpAndRight(){

    Move move = new Move("c2>d1");
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingUpAndLeft(){

    Move move = new Move("c2>b1");
    assertThat(king.isMoveValid(move)).isTrue();
  }
  @Test
  public void shouldAllowMovingDownAndLeft(){

    Move move = new Move("b2>a3");
    assertThat(king.isMoveValid(move)).isTrue();
  }

  @Test
  public void shouldAllowMovingDownAndRight(){

    Move move = new Move("b2>c3");
    assertThat(king.isMoveValid(move)).isTrue();
  }
  @Test
  public void shouldNotAllowMovingTwoSpotsToLeft(){

    Move move = new Move("c4>a4");
    assertThat(king.isMoveValid(move)).isFalse();
  }
  @Test
  public void shouldNotAllowMovingTwoSpotsToRight(){

    Move move = new Move("a5>c5");
    assertThat(king.isMoveValid(move)).isFalse();
  }

  @Test
  public void shouldNotAllowMovingTwoSpotsDown(){

    Move move = new Move("d3>d5");
    assertThat(king.isMoveValid(move)).isFalse();
  }

  @Test
  public void shouldNotAllowPlaceInTheSameSpot(){

    Move move = new Move("d2>d2");
    assertThat(king.isMoveValid(move)).isFalse();
  }
}
