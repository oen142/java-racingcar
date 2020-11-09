package step6.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringUtilsTest {
    @Test
    void repeat() {
        String result = StringUtils.repeat("-" , 5);
        assertThat(result).isEqualTo("-----");
    }
}
