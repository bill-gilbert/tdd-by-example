package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assertions.assertEquals(10, product.amount);
        product = five.times(3);
        Assertions.assertEquals(15, product.amount);

    }
}