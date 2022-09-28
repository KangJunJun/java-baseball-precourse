package baseball.controller;
import baseball.model.Computer;
import static baseball.view.ConsoleIO.*;

public class GameHost {
    private final Computer computer;

    public GameHost() {
        this.computer = new Computer();
    }

    public void startGame() {
        computer.initBaseballNumber();

        String input = inputAnswer();
    }
}
