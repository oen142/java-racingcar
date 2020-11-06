package step001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        if (input == null) {
            return 0;
        }
        if (input.isEmpty()) {
            return 0;
        }

        int sum = 0;
        String[] numbers = input.split(",|:");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;

    }
    public void test(String input){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            // 덧셈 구현
        }
    }
}
