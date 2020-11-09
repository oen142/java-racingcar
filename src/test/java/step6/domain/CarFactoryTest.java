package step6.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarFactoryTest {
    @Test
    void create() {
        List<Car> cars = CarFactory.create("crong,pobi");
        assertThat(cars).hasSize(2);
        assertThat(cars).containsExactly(new Car("crong") , new Car("pobi"));
    }
}
