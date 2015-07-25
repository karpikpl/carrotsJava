package test;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class UtilsTest {

    @Test
    public void testReadResourceString() throws Exception {
        // Arrange
        String expected = "1";

        // Act
        String s = Utils.ReadResourceString("./test/Resources/1.out");

        // Assert
        Assert.assertEquals(expected, s);
    }
}
