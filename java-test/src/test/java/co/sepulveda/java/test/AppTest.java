package co.sepulveda.java.test;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author carlossepulveda
 */
public class AppTest {

    @Test
    public void shouldPlus() {
        int x = 1;
        int y = 2;
        int expected = 3;
        Assert.assertEquals(expected, App.plus(x, y));
    }
}
