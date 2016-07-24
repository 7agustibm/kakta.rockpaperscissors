package rockpaperScissors;

public class Game {
    public GameResult getResult(GameOption player1, GameOption player2) {
        if(player1 == player2){
            return GameResult.Draw;
        }

        if(isWinPlayer1(player1, player2)){
            return GameResult.WinPlayer1;
        }

        if(isWinPlayer2(player1, player2)){
            return GameResult.WinPlayer2;
        }

        return null;
    }

    private boolean isWinPlayer2(GameOption player1, GameOption player2) {
        return isScissorsRock(player1, player2) || isPaperScissors(player1, player2) || isRockPaper(player1, player2);
    }

    private boolean isWinPlayer1(GameOption player1, GameOption player2) {
        return isRockScissors(player1, player2) || isScissorsPaper(player1, player2) || isPaperRock(player1, player2);
    }

    private boolean isRockPaper(GameOption player1, GameOption player2) {
        return player1 == GameOption.Rock && player2 == GameOption.Paper;
    }

    private boolean isPaperRock(GameOption player1, GameOption player2) {
        return player1 == GameOption.Paper && player2 == GameOption.Rock;
    }

    private boolean isPaperScissors(GameOption player1, GameOption player2) {
        return player1 == GameOption.Paper && player2 == GameOption.Scissors;
    }

    private boolean isScissorsRock(GameOption player1, GameOption player2) {
        return player1 == GameOption.Scissors &&  player2 == GameOption.Rock;
    }

    private boolean isScissorsPaper(GameOption player1, GameOption player2) {
        return player1 == GameOption.Scissors && player2 == GameOption.Paper;
    }

    private boolean isRockScissors(GameOption player1, GameOption player2) {
        return player1 == GameOption.Rock &&  player2== GameOption.Scissors;
    }
}
