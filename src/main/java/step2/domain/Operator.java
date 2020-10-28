package step2.domain;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS('+' , (x,y) -> x+y),
    MINUS('-' , (x,y) -> x-y),
    MULTIPLY('*' , (x,y) -> x*y),
    DIVISION('/' , (x,y) -> x/y);

    private char operator;
    private BiFunction<Integer, Integer, Integer> operation;

    Operator(char operator, BiFunction<Integer, Integer, Integer> operation) {
        this.operator = operator;
        this.operation = operation;
    }

}
