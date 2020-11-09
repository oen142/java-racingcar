package step002.domain;

import step002.exception.ValidateLottoSize;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Lotto {
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int LOTTO_BAG = 6;
    private final List<Integer> lottoNumbers;

    private Lotto() {
        lottoNumbers = new ArrayList<>();
        generateLottoNumbers();
    }

    public static Lotto of() {
        return new Lotto();
    }

    public long matchLottoNumbers(List<Integer> lastLottoNumbers) {
        return lottoNumbers.stream()
                .filter(lastLottoNumbers::contains)
                .count();

    }

    private void generateLottoNumbers() {
        List<Integer> lottoBox = new ArrayList<>();
        for (int i = MIN_LOTTO_NUMBER; i < MAX_LOTTO_NUMBER + 1; i++) {
            lottoBox.add(i);
        }
        shuffle(lottoBox);
        for (int i = 0; i < LOTTO_BAG; i++) {
            lottoNumbers.add(lottoBox.get(i));
        }
    }

    private void validateLottoSize(){
        throw new ValidateLottoSize();
    }
}
