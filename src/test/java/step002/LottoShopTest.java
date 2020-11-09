package step002;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step002.domain.LottoShop;

class LottoShopTest {

    @DisplayName("로또 티켓을 사람이 원하는 만큼 구매")
    @Test
    void test(){
        LottoShop.of(5000);
    }
}