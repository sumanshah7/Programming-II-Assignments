import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MonthClassTest {

    @Test
    void test01() {
        Month month = new Month();
        assertEquals(1, month.getMonthNumber());
        assertEquals("January", month.getMonthName());
        assertEquals("January", month.toString());
        month.setMonthNumber(13);
        Month another = new Month(-1);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    void test02() {
        Month month = new Month(1);
        assertEquals(1, month.getMonthNumber());
        assertEquals("January", month.getMonthName());
        assertEquals("January", month.toString());
        Month another = new Month(1);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("January");
        assertEquals(1, month.getMonthNumber());
        assertEquals("January", month.getMonthName());
        assertEquals("January", month.toString());
        another = new Month("January");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(2);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

}
