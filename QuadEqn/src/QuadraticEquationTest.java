import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuadraticEquationTest {
    private static final double EPSILON = 10e-6;

    @Test
    public void test01() {
        try {
            new QuadraticEquation(0, 0, 0);
        } catch (IllegalArgumentException iae) {
            assertEquals("Coefficient 'a' cannot be 0 in a quadratic equation.",
                         iae.getMessage());
        }
    }

    @Test
    public void test02() {
        QuadraticEquation qe = new QuadraticEquation(1, 1, 1);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 1.0, qe.getB(), EPSILON);
        assertEquals("getC()", 1.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + x + 1.0 = 0", qe.toString());
        assertEquals("discriminant()", -3.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.0, qe.root1(), EPSILON);
        assertEquals("root2()", 0.0, qe.root2(), EPSILON);
    }

    @Test
    public void test03() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 12.0, 3.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 12.0, qe.getB(), EPSILON);
        assertEquals("getC()", 3.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 12.0x + 3.0 = 0", qe.toString());
        assertEquals("discriminant()", 132.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.255437, qe.root1(), EPSILON);
        assertEquals("root2()", -11.744563, qe.root2(), EPSILON);
    }

    @Test
    public void test04() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 4.0, 5.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 4.0, qe.getB(), EPSILON);
        assertEquals("getC()", 5.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 4.0x + 5.0 = 0", qe.toString());
        assertEquals("discriminant()", -4, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.0, qe.root1(), EPSILON);
        assertEquals("root2()", 0.0, qe.root2(), EPSILON);
    }

    @Test
    public void test05() {
        try {
            new QuadraticEquation(0, 6, 12);
        } catch (IllegalArgumentException iae) {
            assertEquals(
                    "Coefficient 'a' cannot be 0 in a quadratic equation.",
                    iae.getMessage());
        }
    }

    @Test
    public void test06() {
        QuadraticEquation qe = new QuadraticEquation(9.0, 54.0, 81.0);
        assertEquals("getA()", 9.0, qe.getA(), EPSILON);
        assertEquals("getB()", 54.0, qe.getB(), EPSILON);
        assertEquals("getC()", 81.0, qe.getC(), EPSILON);
        assertEquals("toString()", "9.0x^2 + 54.0x + 81.0 = 0", qe.toString());
        assertEquals("discriminant()", -0.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -3.0, qe.root1(), EPSILON);
        assertEquals("root2()", -3.0, qe.root2(), EPSILON);
    }

    @Test
    public void test07() {//
        QuadraticEquation qe = new QuadraticEquation(1.0, 5.0, 6.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 5.0, qe.getB(), EPSILON);
        assertEquals("getC()", 6.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 5.0x + 6.0 = 0", qe.toString());
        assertEquals("discriminant()", 1.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -2.000000, qe.root1(), EPSILON);
        assertEquals("root2()", -3.000000, qe.root2(), EPSILON);
    }

    @Test
    public void test08() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 4.0, 4.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 4.0, qe.getB(), EPSILON);
        assertEquals("getC()", 4.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 4.0x + 4.0 = 0", qe.toString());
        assertEquals("discriminant()", 0.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -2.000000, qe.root1(), EPSILON);
        assertEquals("root2()", -2.000000, qe.root2(), EPSILON);
    }

    @Test
    public void test09() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 6.0, 9.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 6.0, qe.getB(), EPSILON);
        assertEquals("getC()", 9.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 6.0x + 9.0 = 0", qe.toString());
        assertEquals("discriminant()", 0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -3.0, qe.root1(), EPSILON);
        assertEquals("root2()", -3.0, qe.root2(), EPSILON);
    }

    @Test
    public void test10() {
        QuadraticEquation qe = new QuadraticEquation(2, 6, 3);
        assertEquals("getA()", 2.0, qe.getA(), EPSILON);
        assertEquals("getB()", 6.0, qe.getB(), EPSILON);
        assertEquals("getC()", 3.0, qe.getC(), EPSILON);
        assertEquals("toString()", "2.0x^2 + 6.0x + 3.0 = 0", qe.toString());
        assertEquals("discriminant()", 12.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.633975, qe.root1(), EPSILON);
        assertEquals("root2()", -2.366025, qe.root2(), EPSILON);
    }

    @Test
    public void test11() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 6.0, 8.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 6.0, qe.getB(), EPSILON);
        assertEquals("getC()", 8.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 6.0x + 8.0 = 0", qe.toString());
        assertEquals("discriminant()", 4.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -2.0, qe.root1(), EPSILON);
        assertEquals("root2()", -4.0, qe.root2(), EPSILON);
    }

    @Test
    public void test12() {
        QuadraticEquation qe = new QuadraticEquation(1.0, 11.0, 28.0);
        assertEquals("getA()", 1.0, qe.getA(), EPSILON);
        assertEquals("getB()", 11.0, qe.getB(), EPSILON);
        assertEquals("getC()", 28.0, qe.getC(), EPSILON);
        assertEquals("toString()", "x^2 + 11.0x + 28.0 = 0", qe.toString());
        assertEquals("discriminant()", 9.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -4.0, qe.root1(), EPSILON);
        assertEquals("root2()", -7.0, qe.root2(), EPSILON);
    }

    @Test
    public void test13() {
        try {
            new QuadraticEquation(0, 23, 8);
        } catch (IllegalArgumentException iae) {
            assertEquals(
                    "Coefficient 'a' cannot be 0 in a quadratic equation.",
                    iae.getMessage());
            QuadraticEquation qe = new QuadraticEquation(1, 2, 0);
            assertEquals("getA()", 1.0, qe.getA(), EPSILON);
            assertEquals("getB()", 2.0, qe.getB(), EPSILON);
            assertEquals("getC()", 0.0, qe.getC(), EPSILON);
            assertEquals("toString()", "x^2 + 2.0x = 0", qe.toString());
            assertEquals("discriminant()", 4.0, qe.discriminant(),
                    EPSILON);
            assertEquals("root1()", 0.0, qe.root1(), EPSILON);
            assertEquals("root2()", -2.0, qe.root2(), EPSILON);
        }
    }

    @Test
    public void test14() {
        QuadraticEquation qe = new QuadraticEquation(18.0, 40.0, -16.0);
        assertEquals("getA()", 18.0, qe.getA(), EPSILON);
        assertEquals("getB()", 40.0, qe.getB(), EPSILON);
        assertEquals("getC()", -16.0, qe.getC(), EPSILON);
        assertEquals("toString()", "18.0x^2 + 40.0x - 16.0 = 0", qe.toString());
        assertEquals("discriminant()", 2752.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.346097449844889, qe.root1(), EPSILON);
        assertEquals("root2()", -2.568319672067111, qe.root2(), EPSILON);
    }

    @Test
    public void test15() {
        QuadraticEquation qe = new QuadraticEquation(7.0, 12.0, 4.0);
        assertEquals("getA()", 7.0, qe.getA(), EPSILON);
        assertEquals("getB()", 12.0, qe.getB(), EPSILON);
        assertEquals("getC()", 4.0, qe.getC(), EPSILON);
        assertEquals("toString()", "7.0x^2 + 12.0x + 4.0 = 0", qe.toString());
        assertEquals("discriminant()", 32.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.453082, qe.root1(), EPSILON);
        assertEquals("root2()", -1.261204, qe.root2(), EPSILON);
    }

    @Test
    public void test16() {
        QuadraticEquation qe = new QuadraticEquation(2.0, 24.0, 6.0);
        assertEquals("getA()", 2.0, qe.getA(), EPSILON);
        assertEquals("getB()", 24.0, qe.getB(), EPSILON);
        assertEquals("getC()", 6.0, qe.getC(), EPSILON);
        assertEquals("toString()", "2.0x^2 + 24.0x + 6.0 = 0", qe.toString());
        assertEquals("discriminant()", 528.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.255437, qe.root1(), EPSILON);
        assertEquals("root2()", -11.744563, qe.root2(), EPSILON);
    }

    @Test
    public void test17() {
        QuadraticEquation qe = new QuadraticEquation(2, 4, 6);
        assertEquals("getA()", 2.0, qe.getA(), EPSILON);
        assertEquals("getB()", 4.0, qe.getB(), EPSILON);
        assertEquals("getC()", 6.0, qe.getC(), EPSILON);
        assertEquals("toString()", "2.0x^2 + 4.0x + 6.0 = 0", qe.toString());
        assertEquals("discriminant()", -32.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.0, qe.root1(), EPSILON);
        assertEquals("root2()", 0.0, qe.root2(), EPSILON);
    }

    @Test
    public void test18() {
        QuadraticEquation qe = new QuadraticEquation(8.0, 5.0, 4.0);
        assertEquals("getA()", 8.0, qe.getA(), EPSILON);
        assertEquals("getB()", 5.0, qe.getB(), EPSILON);
        assertEquals("getC()", 4.0, qe.getC(), EPSILON);
        assertEquals("toString()", "8.0x^2 + 5.0x + 4.0 = 0", qe.toString());
        assertEquals("discriminant()", -103.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.0, qe.root1(), EPSILON);
        assertEquals("root2()", 0.0, qe.root2(), EPSILON);
    }

    @Test
    public void test19() {
        QuadraticEquation qe = new QuadraticEquation(2.0, 7.0, 6.0);
        assertEquals("getA()", 2.0, qe.getA(), EPSILON);
        assertEquals("getB()", 7.0, qe.getB(), EPSILON);
        assertEquals("getC()", 6.0, qe.getC(), EPSILON);
        assertEquals("toString()", "2.0x^2 + 7.0x + 6.0 = 0", qe.toString());
        assertEquals("discriminant()", 1.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -1.5, qe.root1(), EPSILON);
        assertEquals("root2()", -2.0, qe.root2(), EPSILON);
    }

    @Test
    public void test20() {
        QuadraticEquation qe = new QuadraticEquation(2.0, 11.0, 4.0);
        assertEquals("getA()", 2.0, qe.getA(), EPSILON);
        assertEquals("getB()", 11.0, qe.getB(), EPSILON);
        assertEquals("getC()", 4.0, qe.getC(), EPSILON);
        assertEquals("toString()", "2.0x^2 + 11.0x + 4.0 = 0", qe.toString());
        assertEquals("discriminant()", 89.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.391505, qe.root1(), EPSILON);
        assertEquals("root2()", -5.108495, qe.root2(), EPSILON);
    }

    @Test
    public void test21() {
        QuadraticEquation qe = new QuadraticEquation(3.0, 8.0, 0.0);
        assertEquals("getA()", 3.0, qe.getA(), EPSILON);
        assertEquals("getB()", 8.0, qe.getB(), EPSILON);
        assertEquals("getC()", 0.0, qe.getC(), EPSILON);
        assertEquals("toString()", "3.0x^2 + 8.0x = 0", qe.toString());
        assertEquals("discriminant()", 64.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", 0.0, qe.root1(), EPSILON);
        assertEquals("root2()", -2.666666, qe.root2(), EPSILON);
    }

    @Test
    public void test22() {
        QuadraticEquation qe = new QuadraticEquation(10.0, 20.0, 5.0);
        assertEquals("getA()", 10.0, qe.getA(), EPSILON);
        assertEquals("getB()", 20.0, qe.getB(), EPSILON);
        assertEquals("getC()", 5.0, qe.getC(), EPSILON);
        assertEquals("toString()", "10.0x^2 + 20.0x + 5.0 = 0", qe.toString());
        assertEquals("discriminant()", 200.0, qe.discriminant(), EPSILON);
        assertEquals("root1()", -0.292893, qe.root1(), EPSILON);
        assertEquals("root2()", -1.707106, qe.root2(), EPSILON);
    }
}