package step002;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Lotto {
    private static final int LIMIT_LOTTO_NUMBER = 45;
    private static final int LOTTO_BAG = 6;
    private final List<Integer> lottoNumbers;

    private Lotto() {
        lottoNumbers = new ArrayList<>();
        generateLottoNumbers();
    }

    public static Lotto of() {
        return new Lotto();
    }

    public void printNumbers() {
        lottoNumbers.forEach(integer -> System.out.print(integer + ","));
    }

    private void generateLottoNumbers() {
        List<Integer> lottoBox = new ArrayList<>();
        for (int i = 0; i < LIMIT_LOTTO_NUMBER; i++) {
            lottoBox.add(i);
        }
        shuffle(lottoBox);
        for (int i = 0; i < LOTTO_BAG; i++) {
            lottoNumbers.add(lottoBox.get(i));
        }
    }

}
