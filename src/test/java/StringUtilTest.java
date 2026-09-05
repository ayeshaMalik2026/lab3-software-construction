import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    private final StringUtil stringUtil = new StringUtil();

    @Test
    public void testSimplePalindrome() {
        assertTrue(stringUtil.isPalindrome("madam"));
    }

    @Test
    public void testCaseInsensitivePalindrome() {
        assertTrue(stringUtil.isPalindrome("RaceCar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(stringUtil.isPalindrome("hello"));
    }

    @Test
    public void testNullAndEmptyString() {
        assertFalse(stringUtil.isPalindrome(null));
        assertFalse(stringUtil.isPalindrome(""));
    }
}