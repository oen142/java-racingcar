package step002;

import java.util.ArrayList;
import java.util.List;

public class LottoTickets {
    private List<Lotto> lottoList;

    private LottoTickets(int ticketCount) {
        lottoList = new ArrayList<>();
        for (int i = 0; i < ticketCount; i++) {
            lottoList.add(Lotto.of());
        }
    }

    public static LottoTickets of(int ticketCount) {
        return new LottoTickets(ticketCount);
    }

    public void printLottoTickets() {
        lottoList.forEach(lotto -> {
            lotto.printNumbers();
            System.out.println("");
        });
    }
}
