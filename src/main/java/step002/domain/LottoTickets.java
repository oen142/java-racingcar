package step002.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoTickets {
    private final List<Lotto> lottoList;

    private LottoTickets(int ticketCount) {
        lottoList = new ArrayList<>();
        for (int i = 0; i < ticketCount; i++) {
            lottoList.add(Lotto.of());
        }
    }

    public static LottoTickets of(int ticketCount) {
        return new LottoTickets(ticketCount);
    }
    public List<Lotto> getLottoList(){
        return lottoList;
    }

}
