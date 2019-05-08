import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class ExpandedFormTest {
    @Test
    public void tests() {
        assertEquals("2", ExpandedForm.expand(2));
        assertEquals("10 + 2", ExpandedForm.expand(12));
        assertEquals("40 + 2", ExpandedForm.expand(42));
        assertEquals("100", ExpandedForm.expand(100));
        assertEquals("100 + 2", ExpandedForm.expand(102));
        assertEquals("100 + 10 + 2", ExpandedForm.expand(112));
        assertEquals("70000 + 300 + 4", ExpandedForm.expand(70304));
    }
}
