package step2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void Test(){
        Operator[] values = Operator.values();
        for (Operator value : values) {
            System.out.println("value = " + value.operator);

        }
    }
}