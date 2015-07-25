package test;

import junit.framework.Assert;
import org.junit.Test;

import carrots.Reader;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class ReaderTest {

    @Test
    public void Reader_Should_InitWithStdin() {
        // Arrange

        // Act
        Reader reader = new Reader(System.in);

        // Assert
    }

    @Test
    public void Reader_Should_ReadSampleInput() {
        // Arrange
        final Reader reader = new Reader("1 2\nTest string");

        // Act
        int one = reader.readInt();
        int two = reader.readInt();
        reader.readLine();
        String s = reader.readLine();

        // Assert
        Assert.assertEquals(1, one);
        Assert.assertEquals(2, two);
        Assert.assertEquals("Test string", s);
    }
}
