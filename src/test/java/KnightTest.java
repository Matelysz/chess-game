import org.junit.Test;
import sda.games.chess.Knight;
import sda.games.chess.Move;

import static org.assertj.core.api.Assertions.assertThat;

public class KnightTest {

    @Test
    public void ShouldMovingNorthEast() {
        Knight knight = new Knight();
        Move move = new Move("b5>c3");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldMovingSouthWest() {
        Knight knight = new Knight();
        Move move = new Move("b2>a4");
        assertThat(knight.isMoveValid(move)).isTrue();
    }


    @Test
    public void ShouldMovingNorthWest() {
        Knight knight = new Knight();
        Move move = new Move("d4>c2");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldMovingSouthEast() {
        Knight knight = new Knight();
        Move move = new Move("c5>d7");
        assertThat(knight.isMoveValid(move)).isTrue();
    }

    @Test
    public void ShouldNotMovingSouth() {
        Knight knight = new Knight();
        Move move = new Move("g3>g4");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingFarLikeBishop() {
        Knight knight = new Knight();
        Move move = new Move("a2>e6");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingWest() {
        Knight knight = new Knight();
        Move move = new Move("h1>a1");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingEast() {
        Knight knight = new Knight();
        Move move = new Move("b3>f3");
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldNotMovingInTheSamePlace() {
        Knight knight = new Knight();
        Move move = new Move("a2>a2");
        assertThat(knight.isMoveValid(move)).isFalse();
    }
}
