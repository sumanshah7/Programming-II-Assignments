import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MonthClassTestComplete {

    private static String[] numberToName = new String[] {
        null,
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };
    
    @Test
    public void test00() {
        Month month = null;
        try {
            month = new Month(0);
        } catch (MonthException me) {
            assertEquals("Invalid month number 0.", me.getMessage());
        }
        try {
            month = new Month(13);
        } catch (MonthException me) {
            assertEquals("Invalid month number 13.", me.getMessage());
        }
        try {
            month = new Month(10);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        try {
            month.setMonthNumber(-1);
        } catch (MonthException me) {
            assertEquals("Invalid month number -1.", me.getMessage());
        }
        try {
            month.setMonthNumber(14);
        } catch (MonthException me) {
            assertEquals("Invalid month number 14.", me.getMessage());
        }
        try {
            month = new Month("Jan");
        } catch (MonthException me) {
            assertEquals("Invalid month name 'Jan'.", me.getMessage());
        }
        try {
            month = new Month("hello");
        } catch (MonthException me) {
            assertEquals("Invalid month name 'hello'.", me.getMessage());
        }
    }

    @Test
    public void test01() {
        Month month = new Month();
        assertEquals(1, month.getMonthNumber());
        assertEquals(numberToName[1], month.getMonthName());
        assertEquals(numberToName[1], month.toString());
        try {
            month = new Month(1);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(1, month.getMonthNumber());
        assertEquals(numberToName[1], month.getMonthName());
        assertEquals(numberToName[1], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[1]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(2);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));

        try {
            another.setMonthNumber(1);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    public void test02() {
        Month month = null;
        try {
            month = new Month(2);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(2, month.getMonthNumber());
        assertEquals(numberToName[2], month.getMonthName());
        assertEquals(numberToName[2], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[2]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(3);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test03() {
        Month month = null;
        try {
            month = new Month(3);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(3, month.getMonthNumber());
        assertEquals(numberToName[3], month.getMonthName());
        assertEquals(numberToName[3], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[3]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(4);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test04() {
        Month month = null;
        try {
            month = new Month(4);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(4, month.getMonthNumber());
        assertEquals(numberToName[4], month.getMonthName());
        assertEquals(numberToName[4], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[4]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(5);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test05() {
        Month month = null;
        try {
            month = new Month(5);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(5, month.getMonthNumber());
        assertEquals(numberToName[5], month.getMonthName());
        assertEquals(numberToName[5], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[5]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(6);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test06() {
        Month month = null;
        try {
            month = new Month(6);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(6, month.getMonthNumber());
        assertEquals(numberToName[6], month.getMonthName());
        assertEquals(numberToName[6], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[6]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(7);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test07() {
        Month month = null;
        try {
            month = new Month(7);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(7, month.getMonthNumber());
        assertEquals(numberToName[7], month.getMonthName());
        assertEquals(numberToName[7], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[7]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(8);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test08() {
        Month month = null;
        try {
            month = new Month(8);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(8, month.getMonthNumber());
        assertEquals(numberToName[8], month.getMonthName());
        assertEquals(numberToName[8], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[8]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(9);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test09() {
        Month month = null;
        try {
            month = new Month(9);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(9, month.getMonthNumber());
        assertEquals(numberToName[9], month.getMonthName());
        assertEquals(numberToName[9], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[9]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(10);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test10() {
        Month month = null;
        try {
            month = new Month(10);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(10, month.getMonthNumber());
        assertEquals(numberToName[10], month.getMonthName());
        assertEquals(numberToName[10], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[10]);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(11);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test11() {
        Month month = null;
        try {
            month = new Month(11);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(11, month.getMonthNumber());
        assertEquals(numberToName[11], month.getMonthName());
        assertEquals(numberToName[11], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[11].toUpperCase());
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(12);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertTrue(month.lessThan(another));
        assertFalse(month.greaterThan(another));
    }

    @Test
    public void test12() {
        Month month = null;
        try {
            month = new Month(12);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertEquals(12, month.getMonthNumber());
        assertEquals(numberToName[12], month.getMonthName());
        assertEquals(numberToName[12], month.toString());
        Month another = null;
        try {
            another = new Month(numberToName[12].toLowerCase());
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        try {
            another.setMonthNumber(1);
        } catch (MonthException me) {
            assertTrue(me == null);
        }
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
        assertFalse(month.lessThan(another));
        assertTrue(month.greaterThan(another));
    }
}
