import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimerUtilTest {

    private final TimerUtil timerUtil = new TimerUtil();

    @Test
    public void testNormalCase() {
        int result = timerUtil.secondsBetween(10, 25);
        assertEquals(15, result);
    }

    @Test
    public void testBoundaryZeroToZero() {
        int result = timerUtil.secondsBetween(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            timerUtil.secondsBetween(30, 10);
        });
    }
}