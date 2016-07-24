package rockpaperScissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;

    @Before
    public void getGame() {
        game = new Game();
    }

    @Test
    public void whenRockVsScissorsThenReturnWinPlayer1(){
        GameResult result = game.getResult(GameOption.Rock, GameOption.Scissors);

        assertWinPlayer1(result);
    }

    @Test
    public void whenScissorsVsRockThenReturnWinPlayer2(){
        GameResult result = game.getResult(GameOption.Scissors, GameOption.Rock);

        assertPlayer2(result);
    }

    @Test
    public void whenScissorsVsPaperThenReturnWinPlayer1(){
        GameResult result = game.getResult(GameOption.Scissors, GameOption.Paper);

        assertWinPlayer1(result);
    }

    public void assertWinPlayer1(GameResult result) {
        assertEquals(GameResult.WinPlayer1, result);
    }

    @Test
    public void whenPaperVsScissorsThenReturnWinPlayer2(){
        GameResult result = game.getResult(GameOption.Paper, GameOption.Scissors);

        assertPlayer2(result);
    }

    public void assertPlayer2(GameResult result) {
        assertEquals(GameResult.WinPlayer2, result);
    }

    @Test
    public void whenPaperVsRockThenReturnWinPlayer1(){
        GameResult result = game.getResult(GameOption.Paper, GameOption.Rock);

        assertWinPlayer1(result);
    }

    @Test
    public void whenRockVsPaperThenReturnWinPlayer2(){
        GameResult result = game.getResult(GameOption.Rock, GameOption.Paper);

        assertPlayer2(result);
    }

    @Test
    public void whenIsEqualsThenReturnDraw(){
        GameResult result = game.getResult(GameOption.Paper, GameOption.Paper);

        assertEquals(GameResult.Draw, result);
    }

    @Test
    public void whenOneOptionIsNullThenReturnNull(){
        GameResult result = game.getResult(null, GameOption.Paper);

        assertNull(result);
    }
}