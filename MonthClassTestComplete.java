import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MonthClassTestComplete {

    @Test
    void test00() {
        Month month = new Month(2);
        assertEquals(2, month.getMonthNumber());
        assertEquals("February", month.getMonthName());
        assertEquals("February", month.toString());
        Month another = new Month(2);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("February");
        assertEquals(2, month.getMonthNumber());
        assertEquals("February", month.getMonthName());
        assertEquals("February", month.toString());
        another = new Month("February");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(12);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test01() {
        Month month = new Month(9);
        assertEquals(9, month.getMonthNumber());
        assertEquals("September", month.getMonthName());
        assertEquals("September", month.toString());
        month.setMonthNumber(9);
        Month another = new Month(9);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    void test02() {
        Month month = new Month(8);
        assertEquals(8, month.getMonthNumber());
        assertEquals("August", month.getMonthName());
        assertEquals("August", month.toString());
        Month another = new Month(8);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("May");
        assertEquals(5, month.getMonthNumber());
        assertEquals("May", month.getMonthName());
        assertEquals("May", month.toString());
        another = new Month("May");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(2);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test03() {
        Month month = new Month();
        assertEquals(1, month.getMonthNumber());
        month.setMonthNumber(4);
        assertEquals("April", month.getMonthName());
        month.setMonthNumber(1);
        assertEquals("January", month.toString());
        month.setMonthNumber(0);
        Month another = new Month(-1);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    void test04() {
        Month month = new Month(4);
        assertEquals(4, month.getMonthNumber());
        assertEquals("April", month.getMonthName());
        assertEquals("April", month.toString());
        Month another = new Month(4);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("April");
        assertEquals(4, month.getMonthNumber());
        assertEquals("April", month.getMonthName());
        assertEquals("April", month.toString());
        another = new Month("April");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(7);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test05() {
        Month month = new Month(5);
        assertEquals(5, month.getMonthNumber());
        assertEquals("May", month.getMonthName());
        assertEquals("May", month.toString());
        Month another = new Month(5);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("May");
        assertEquals(5, month.getMonthNumber());
        assertEquals("May", month.getMonthName());
        assertEquals("May", month.toString());
        another = new Month("May");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(6);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test06() {
        Month month = new Month(4);
        assertEquals(4, month.getMonthNumber());
        assertEquals("April", month.getMonthName());
        assertEquals("April", month.toString());
        Month another = new Month(4);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("September");
        assertEquals(9, month.getMonthNumber());
        assertEquals("September", month.getMonthName());
        assertEquals("September", month.toString());
        another = new Month("September");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(11);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test07() {
        Month month = new Month(7);
        assertEquals(7, month.getMonthNumber());
        assertEquals("July", month.getMonthName());
        assertEquals("July", month.toString());
        Month another = new Month(7);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("July");
        assertEquals(7, month.getMonthNumber());
        assertEquals("July", month.getMonthName());
        assertEquals("July", month.toString());
        another = new Month("July");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(10);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test08() {
        Month month = new Month(8);
        assertEquals(8, month.getMonthNumber());
        assertEquals("August", month.getMonthName());
        assertEquals("August", month.toString());
        Month another = new Month(8);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("August");
        assertEquals(8, month.getMonthNumber());
        assertEquals("August", month.getMonthName());
        assertEquals("August", month.toString());
        another = new Month("August");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(3);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test09() {
        Month month = new Month(9);
        assertEquals(9, month.getMonthNumber());
        assertEquals("September", month.getMonthName());
        assertEquals("September", month.toString());
        Month another = new Month(9);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("September");
        assertEquals(9, month.getMonthNumber());
        assertEquals("September", month.getMonthName());
        assertEquals("September", month.toString());
        another = new Month("September");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(11);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test10() {
        Month month = new Month(12);
        assertEquals(12, month.getMonthNumber());
        assertEquals("December", month.getMonthName());
        assertEquals("December", month.toString());

        Month another = new Month(3);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));

        month = new Month("March");
        assertEquals(3, month.getMonthNumber());
        assertEquals("March", month.getMonthName());
        assertEquals("March", month.toString());

        Month greaterMonth = new Month(5);
        assertTrue(month.equals(month));
        assertFalse(greaterMonth.equals(month));
    }

    @Test
    void test11() {
        Month month = new Month(13);
        assertEquals(1, month.getMonthNumber());
        assertEquals("January", month.getMonthName());
        assertEquals("January", month.toString());
        Month another = new Month(-1);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    void test12() {
        Month month = new Month(6);
        assertEquals(6, month.getMonthNumber());
        assertEquals("June", month.getMonthName());
        assertEquals("June", month.toString());
        Month another = new Month(6);
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

    @Test
    void test13() {
        Month month = new Month(10);
        assertEquals(10, month.getMonthNumber());
        assertEquals("October", month.getMonthName());
        assertEquals("October", month.toString());
        Month another = new Month(10);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("October");
        assertEquals(10, month.getMonthNumber());
        assertEquals("October", month.getMonthName());
        assertEquals("October", month.toString());
        another = new Month("October");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(12);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test14() {
        Month month = new Month(11);
        assertEquals(11, month.getMonthNumber());
        assertEquals("November", month.getMonthName());
        assertEquals("November", month.toString());
        Month another = new Month(11);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("November");
        assertEquals(11, month.getMonthNumber());
        assertEquals("November", month.getMonthName());
        assertEquals("November", month.toString());
        another = new Month("November");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(12);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }

    @Test
    void test15() {
        Month month = new Month(12);
        assertEquals(12, month.getMonthNumber());
        assertEquals("December", month.getMonthName());
        assertEquals("December", month.toString());
        Month another = new Month("December");
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

    @Test
    void test16() {
        Month month = new Month("March");
        assertEquals(3, month.getMonthNumber());
        assertEquals("March", month.getMonthName());
        assertEquals("March", month.toString());
        month.setMonthNumber(13);
        Month another = new Month(-1);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
    }

    @Test
    void test17() {
        Month month = new Month(2);
        assertEquals(2, month.getMonthNumber());
        assertEquals("February", month.getMonthName());
        assertEquals("February", month.toString());
        Month another = new Month("February");
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));

        month = new Month("June");
        assertEquals(6, month.getMonthNumber());
        assertEquals("June", month.getMonthName());
        assertEquals("June", month.toString());
        another = new Month(6);
        assertTrue(month.equals(another));
        assertTrue(another.equals(month));
        another.setMonthNumber(2);
        assertFalse(month.equals(another));
        assertFalse(another.equals(month));
    }
}
