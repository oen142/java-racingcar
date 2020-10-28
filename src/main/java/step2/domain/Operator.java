package step2.domain;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS('+' , (x,y) -> x+y),
    MINUS('-' , (x,y) -> x-y),
    MULTIPLY('*' , (x,y) -> x*y),
    DIVISION('/' , (x,y) -> x/y);

    public char operator;
    public BiFunction<Integer, Integer, Integer> operation;

    Operator(char operator, BiFunction<Integer, Integer, Integer> operation) {
        this.operator = operator;
        this.operation = operation;
    }
    public static int operate(int x , int y , String operator){
        return 0;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operator=" + operator +
                ", operation=" + operation +
                '}';
    }
}
