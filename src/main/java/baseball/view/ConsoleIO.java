package baseball.view;
import camp.nextstep.edu.missionutils.Console;

public class ConsoleIO {
    private static final String INPUT_SENTENCE = "숫자를 입력해주세요 : ";

    public static String inputAnswer() {
        System.out.print(INPUT_SENTENCE);

        return Console.readLine();
    }
}
