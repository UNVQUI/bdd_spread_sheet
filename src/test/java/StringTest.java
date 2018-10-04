import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    @Test
    public void testSubstr() {
        assertEquals("=id(a1)".substring(4, 6), "a1");
    }
}

