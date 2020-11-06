package step002;

import java.util.List;

public class LottoGame {

    private LottoShop lottoShop;
    private List<Integer> userLottoList;

    private LottoGame(String userLotto) {
        String[] split = userLotto.split(",");
        for (String s : split) {
            userLottoList.add(Integer.parseInt(s));
        }

    }

    public static LottoGame of(String userLotto) {
        return new LottoGame(userLotto);
    }

}
