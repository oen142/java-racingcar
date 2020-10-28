package step2.exception;

public class NullIllegalArgumentException extends  IllegalArgumentException {
    public NullIllegalArgumentException() {
        super("입력값이 널입니다.");
    }
}
