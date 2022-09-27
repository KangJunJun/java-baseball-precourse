package baseball.model;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {

    private List<Integer> baseballNumber;
    private int getRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

    private Set<Integer> generateBaseballNumber(){
        Set<Integer> digitSet = new HashSet<>();

        while (digitSet.size() < 3) {
            digitSet.add(getRandomNumber());
        }

        return digitSet;
    }
    public void initBaseballNumber() {
        baseballNumber = new ArrayList<>(generateBaseballNumber());
    }
}
