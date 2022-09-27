package baseball;

import baseball.model.Computer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ComputerTest {

    @Test
    @DisplayName("Generate baseball number test")
    void generateBaseballNumber() throws Exception{
        Computer computer = new Computer();
        computer.initBaseballNumber();

        Field baseballField = computer.getClass().getDeclaredField("baseballNumber");
        baseballField.setAccessible(true);
        List<?> baseballNumber = (List<?>)baseballField.get(computer);

        assertThat(baseballNumber.size()).isEqualTo(3);
        for (int i = 0; i < baseballNumber.size() - 1; i++) {
            assertThat(baseballNumber.get(i) instanceof Integer).isTrue() ;
            extracted(baseballNumber, i);
        }
    }

    private void extracted(List<?> baseballNumber, int i) {
        for (int j = i + 1; j < baseballNumber.size(); j++) {
            assertThat(!baseballNumber.get(i).equals(baseballNumber.get(j))).isTrue();
        }
    }

}
