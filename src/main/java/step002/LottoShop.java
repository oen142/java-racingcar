package step002;

public class LottoShop {

    private static final int lottoPrice = 1000;


    private LottoShop(int userMoney) {
        int ticketCount = userMoney / lottoPrice;
        LottoTickets of = LottoTickets.of(ticketCount);
        of.printLottoTickets();
    }

    public static LottoShop of(int userMoney) {
        return new LottoShop(userMoney);
    }
}
