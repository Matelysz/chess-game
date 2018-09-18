import org.junit.Test;
import sda.games.chess.Move;
import sda.games.chess.Queen;

import static org.assertj.core.api.Assertions.assertThat;

public class QueenTest {
    Queen queen = new Queen();

    @Test
    public void shouldNotAllowMovingLikeKnightDown(){
        Move move = new Move("d4>e6");
        assertThat(queen.isMoveValid(move)).isFalse();
    }

    @Test
    public void shouldNotAllowMovingLikeKnightUp(){
        Move move = new Move("d4>c2");
        assertThat(queen.isMoveValid(move)).isFalse();
    }

    @Test
    public void shouldNotAllowMovingToRandomField(){
        Move move = new Move("b5>f3");
        assertThat(queen.isMoveValid(move)).isFalse();
    }


    @Test
    public void shouldAllowMovingLeft(){

        Move move = new Move("b2>h2");
        assertThat(queen.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingUp(){

        Move move = new Move("c6>c2");
        assertThat(queen.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingSouthEast(){
        Move move = new Move("b2>d4");
        assertThat(queen.isMoveValid(move)).isTrue();
    }

    @Test
    public void shouldAllowMovingNorthWest(){
        Move move = new Move("d4>a1");
        assertThat(queen.isMoveValid(move)).isTrue();
    }

    @Test
    public void shouldNotAllowStayingInTheSameSpot(){
        Move move = new Move("c5>c5");
        assertThat(queen.isMoveValid(move)).isTrue();
    }
}
