package feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import rockpaperScissors.Game;
import rockpaperScissors.GameOption;
import rockpaperScissors.GameResult;
import rockpaperScissors.Player;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    Player player1;
    Player player2;

    @Given("^I have chosen rock$")
    public void iHaveChosenRock() throws Throwable {
        player1 = new Player();
        player1.setChoose(GameOption.Rock);
    }

    @When("^the opponent chooses scissors$")
    public void theOpponentChoosesScissors() throws Throwable {
        player2 = new Player();
        player2.setChoose(GameOption.Scissors);
    }

    @Then("^I should win$")
    public void iShouldWin() throws Throwable {
        Game game = new Game();
        GameResult result = game.getResult(player1.getChoose(), player2.getChoose());
        assertEquals(GameResult.WinPlayer1, result);
    }

    @Given("^I have chosen scissors$")
    public void iHaveChosenScissors() throws Throwable {
        player1 = new Player();
        player1.setChoose(GameOption.Scissors);
    }

    @When("^the opponent chooses rock$")
    public void theOpponentChoosesRock() throws Throwable {
        player2 = new Player();
        player2.setChoose(GameOption.Rock);
    }

    @Then("^they should win$")
    public void theyShouldWin() throws Throwable {
        Game game = new Game();
        GameResult result = game.getResult(player1.getChoose(), player2.getChoose());
        assertEquals(GameResult.WinPlayer2, result);
    }

    @When("^the opponent chooses paper$")
    public void theOpponentChoosesPaper() throws Throwable {
        player2 = new Player();
        player2.setChoose(GameOption.Paper);
    }

    @Given("^I have chosen paper$")
    public void iHaveChosenPaper() throws Throwable {
        player1 = new Player();
        player1.setChoose(GameOption.Paper);
    }

    @Then("^it should be a draw$")
    public void itShouldBeADraw() throws Throwable {
        Game game = new Game();
        GameResult result = game.getResult(player1.getChoose(), player2.getChoose());
        assertEquals(GameResult.Draw, result);
    }
}
