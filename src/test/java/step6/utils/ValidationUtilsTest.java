package step6.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {

    @Test
    @DisplayName("이름을 벨리데이션한다.")
    void valid_name() {
        boolean result = validName("pobi");
        assertThat(result).isTrue();
    }
}
