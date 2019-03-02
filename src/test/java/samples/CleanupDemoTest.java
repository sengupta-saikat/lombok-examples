package samples;

import org.junit.Assert;
import org.junit.Test;

public class CleanupDemoTest {

    @Test
    public void cleanup() {
        Assert.assertEquals("Quality", new CleanupDemo().cleanup());
    }
}