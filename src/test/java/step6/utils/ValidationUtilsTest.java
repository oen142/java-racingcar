package step6.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static step6.utils.ValidationUtils.validName;

class ValidationUtilsTest {

    @Test
    @DisplayName("이름을 벨리데이션한다.")
    void valid_name() {
        assertThat(validName("p")).isTrue();
        assertThat(validName("crong")).isTrue();
    }

    @Test
    @DisplayName("이름을 벨리데이션한다.")
    void invalid_name() {
        assertThat(validName(null)).isFalse();
        assertThat(validName("")).isFalse();
        assertThat(validName("javaji")).isFalse();
    }

}
