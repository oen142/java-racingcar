package step002.domain;

public enum LottoRank {

    FIRST(6, 2_000_000_000L),
    SECOND(5, 1_500_000L),
    THIRD(4, 50_000L),
    FORTH(3, 5_000L);

    private int matchCount;
    private Long price;

    LottoRank(int matchCount, Long price) {
        this.matchCount = matchCount;
        this.price = price;
    }




}
