package samples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonNullDemoTest {

    @Test
    public void isEven() {
        Assert.assertTrue(NonNullDemo.isEven(4));
    }
}