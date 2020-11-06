package step002;

public enum LottoRank {

    FIRST(1, 2_000_000_000L),
    SECOND(2, 1_500_000L),
    THIRD(3, 50_000L),
    FORTH(4, 5_000L);

    private int rank;
    private Long price;

    LottoRank(int rank, Long price) {
        this.rank = rank;
        this.price = price;
    }



}
