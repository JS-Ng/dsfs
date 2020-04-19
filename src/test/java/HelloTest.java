import junit.framework.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloTest{
    protected int val1, val2;
    @Before
    public void setUp() {
        val1 = 1;
        val2 = 2;
    }

    @Test
    public void testAdd() {
        float result = this.val1 + this.val2;
        assertTrue(result == 3.0);
    }
}
