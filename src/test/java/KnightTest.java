import org.junit.Test;
import sda.games.chess.Knight;
import sda.games.chess.Move;

import static org.assertj.core.api.Assertions.assertThat;
import static sda.games.chess.Color.WHITE;

public class KnightTest {
    Knight knight = new Knight(WHITE);
    @Test
    public void ShouldMovingNorthEast() {

        Move move = new Move("b5>c3");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldMovingSouthWest() {

        Move move = new Move("b2>a4");
        assertThat(knight.isMoveValid(move)).isTrue();
    }


    @Test
    public void ShouldMovingNorthWest() {
        Move move = new Move("d4>c2");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldMovingSouthEast() {

        Move move = new Move("c5>d7");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldNotMovingSouth() {

        Move move = new Move("g3>g4");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingFarLikeBishop() {

        Move move = new Move("a2>e6");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingWest() {

        Move move = new Move("h1>a1");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingEast() {

        Move move = new Move("b3>f3");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingInTheSamePlace() {

        Move move = new Move("a2>a2");
        assertThat(knight.isMoveValid(move)).isFalse();
    }
}
