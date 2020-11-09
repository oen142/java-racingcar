package step002.domain;

public class LottoShop {

    private static final int lottoPrice = 1000;


    private LottoShop(int userMoney) {
        int ticketCount = userMoney / lottoPrice;
        LottoTickets lottoTickets = LottoTickets.of(ticketCount);
    }

    public static LottoShop of(int userMoney) {
        return new LottoShop(userMoney);
    }
}
