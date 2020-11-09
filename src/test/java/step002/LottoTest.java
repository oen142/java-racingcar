package step002;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step002.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

class LottoTest {

    @DisplayName("로또 번호들은 1과 45사이의 값이다.")
    @Test
    void 로또_번호_확인(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        boolean contains = list.contains(2);
        System.out.println("contains = " + contains);
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(System.out::println);

    }
}