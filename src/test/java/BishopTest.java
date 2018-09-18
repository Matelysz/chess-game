import org.junit.Test;
import sda.games.chess.Bishop;
import sda.games.chess.Move;

import static org.assertj.core.api.Assertions.assertThat;

public class BishopTest {
Bishop bishop = new Bishop();
@Test
    public void shouldNotAllowMovingForward(){
    Move move = new Move("b2>b4");
    assertThat(bishop.isMoveValid(move)).isFalse();
    }
@Test
    public void shouldNotAllowMovingBackward(){
    Move move = new Move("c5>c1");
    assertThat(bishop.isMoveValid(move)).isFalse();
    }

    @Test
    public void shouldNotAllowMovingLeft(){
        Move move = new Move("f4>c4");
        assertThat(bishop.isMoveValid(move)).isFalse();
    }
    @Test
    public void shouldNotAllowMovingRight(){
        Move move = new Move("b7>g7");
        assertThat(bishop.isMoveValid(move)).isFalse();
    }

    @Test
    public void shouldAllowMovingSouthEast(){
    Move move = new Move("b2>d4");
    assertThat(bishop.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingSouthWest(){
        Move move = new Move("e2>b5");
        assertThat(bishop.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingNorthWest(){
        Move move = new Move("d4>a1");
        assertThat(bishop.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingNorthEast(){
        Move move = new Move("c5>f2");
        assertThat(bishop.isMoveValid(move)).isTrue();
    }
@Test
    public void shouldNotAllowStayingInTheSameSpot(){
        Move move = new Move("c5>c5");
        assertThat(bishop.isMoveValid(move)).isTrue();
    }
}
