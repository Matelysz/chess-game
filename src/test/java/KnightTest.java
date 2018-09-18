import org.junit.Test;
import sda.games.chess.Knight;
import sda.games.chess.Move;

import static org.assertj.core.api.Assertions.assertThat;

public class KnightTest {

    @Test
    public void ShouldToGoLikeHorse() {
        Knight knight = new Knight();
        Move move = new Move(0, 0, 1, 2);
        assertThat(knight.isMoveValid(move)).isFalse();
    }

    @Test
    public void ShouldToGoLikeHorse2() {
        Knight knight = new Knight();
        Move move = new Move(5, 3, 4, 1);
        assertThat(knight.isMoveValid(move)).isFalse();
    }


}
