package test;

import carrots.Reader;
import carrots.Solver;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class SolverTest {

    @Test
    public void solve_should_returnCorrectAnswer_When_Case1() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./test/Resources/1.in"));
        int expectedAnswer = Integer.parseInt(Utils.ReadResourceString("./test/Resources/1.out"));
        Solver solver = new Solver(reader);

        // Act
        int answer = solver.solve();

        // Assert
        Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void solve_should_returnCorrectAnswer_When_Case2() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./test/Resources/2.in"));
        int expectedAnswer = Integer.parseInt(Utils.ReadResourceString("./test/Resources/2.out"));
        Solver solver = new Solver(reader);

        // Act
        int answer = solver.solve();

        // Assert
        Assert.assertEquals(expectedAnswer, answer);
    }
}
