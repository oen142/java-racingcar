package step0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringTest {
    @Test
    void split(){
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1" , "2");
    }
}
