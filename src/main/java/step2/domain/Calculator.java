package step2.domain;

import step2.exception.NullIllegalArgumentException;
import org.apache.commons.lang3.StringUtils;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int calculate(String input) {
        validNull(input);
        String[] splits = input.split(" ");
        int loopSize = splits.length;
        int operateResult = 0;
        for (int i = 0; i < loopSize; i=i+2) {
            operateResult += Operator.operate( parseInt(splits[i]) , parseInt(splits[i+2]) , splits[i+1]);
        }

        return operateResult;
    }

    private static void validNull(String input) {
        if (StringUtils.isBlank(input)) {
            throw new NullIllegalArgumentException();
        }
    }

}
