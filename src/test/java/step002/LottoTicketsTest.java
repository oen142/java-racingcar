package step002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTicketsTest {

    @Test
    void test() {
        LottoTickets.of(15).printLottoTickets();
    }

}