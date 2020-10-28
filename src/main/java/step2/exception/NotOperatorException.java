package step2.exception;

public class NotOperatorException extends IllegalArgumentException {
    public NotOperatorException() {
        super("입력값이 연산자가 아닙니다.");
    }
}
