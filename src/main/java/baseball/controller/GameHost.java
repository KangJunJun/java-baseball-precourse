package baseball.controller;
import baseball.model.Computer;

public class GameHost {
    private final Computer computer;
    public GameHost() {
        this.computer = new Computer();
    }

    public void startGame() {
        computer.initBaseballNumber();
    }
}
