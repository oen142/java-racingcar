package step002.controller;

import step002.domain.LottoShop;
import step002.view.InputView;
import step002.view.ResultView;

public class LottoController {

    private final InputView inputView ;
    private final ResultView resultView;
    private LottoController() {
        inputView = new InputView();
        resultView = new ResultView();
    }

    public static LottoController of() {
        return new LottoController();
    }

    public void runLotto() {

    }
}
