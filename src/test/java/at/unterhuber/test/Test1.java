package at.unterhuber.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    private ClassToTest cls = new ClassToTest();

    @Test
    public void test_subtract10And4_shouldReturn6() {
        int x = 5;
        System.out.println(x);
        Assertions.assertEquals(6, cls.subtract(10, 4));
    }

    @Test
    public void test_add10And4_shouldReturn14() {
        Assertions.assertEquals(14, cls.add(10, 4));
    }
}
