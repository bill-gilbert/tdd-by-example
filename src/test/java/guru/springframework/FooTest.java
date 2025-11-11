package guru.springframework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FooTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fooTest() {
        Foo foo = new Foo();
        Assertions.assertEquals("foo", foo.foo());
    }
}
