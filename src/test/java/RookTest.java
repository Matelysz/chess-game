import org.junit.Before;
import org.junit.Test;
import sda.games.chess.King;
import sda.games.chess.Move;
import sda.games.chess.Rook;

import static org.assertj.core.api.Assertions.assertThat;

public class RookTest {

    Rook rook;
    @Before
    public void createRook(){
        rook = new Rook();
    }



    @Test
    public void shouldAllowMovingDown(){

        Move move = new Move("b2>b7");
        assertThat(rook.isMoveValid(move)).isTrue();
    }

    @Test
    public void shouldAllowMovingUp(){

        Move move = new Move("c6>c2");
        assertThat(rook.isMoveValid(move)).isTrue();
    }

    @Test
    public void shouldAllowMovingLeft(){

        Move move = new Move("b2>h2");
        assertThat(rook.isMoveValid(move)).isTrue();
    }
    @Test
    public void shouldAllowMovingRight(){

        Move move = new Move("c7>h7");
        assertThat(rook.isMoveValid(move)).isTrue();
    }

    @Test
    public void shouldNotAllowMovingUpAndRight(){

        Move move = new Move("b5>d3");
        assertThat(rook.isMoveValid(move)).isFalse();
    }
    @Test
    public void shouldNotAllowMovingDownAndRight(){

        Move move = new Move("d3>g6");
        assertThat(rook.isMoveValid(move)).isFalse();
    }
    @Test
    public void shouldNotAllowMovingDownAndLeft(){

        Move move = new Move("d3>b5");
        assertThat(rook.isMoveValid(move)).isFalse();
    }
    @Test
    public void shouldNotAllowMovingUpAndLeft(){

        Move move = new Move("d3>b1");
        assertThat(rook.isMoveValid(move)).isFalse();
    }

    @Test
    public void shouldNotAllowPlaceInTheSameSpot(){

        Move move = new Move("d2>d2");
        assertThat(rook.isMoveValid(move)).isFalse();
    }

}
