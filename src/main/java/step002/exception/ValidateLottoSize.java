package step002.exception;

public class ValidateLottoSize extends IllegalArgumentException {
    private static final String LOTTO_SIZE_EXCEPTION = "갯수가 맞지 않습니다.";
    public ValidateLottoSize() {
        super(LOTTO_SIZE_EXCEPTION);
    }
}
