import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShipsTest {
    private static Ship ship;
    private static CruiseShip cruiseShip;
    private static CargoShip cargoShip;

    @BeforeAll
    public static void init() {
        ship = new Ship("Mayflower", 1620);
        cruiseShip = new CruiseShip("Blazer", 2022, 1000);
        cargoShip = new CargoShip("Heavy Lifter", 1989, 10);
    }

    @Test
    void test01() {
        assertEquals("Mayflower", ship.getName());
    }

    @Test
    void test02() {
        assertEquals(1620, ship.getYearBuilt());
    }

    @Test
    void test03() {
        assertEquals("Name: Mayflower, year built: 1620", ship.toString());
    }

    @Test
    void test04() {
        ship.setName("Santa Maria");
        assertEquals("Santa Maria", ship.getName());
    }

    @Test
    void test05() {
        ship.setYearBuilt(1460);
        assertEquals(1460, ship.getYearBuilt());
    }

    @Test
    void test06() {
        assertEquals("Name: Santa Maria, year built: 1460", ship.toString());
    }

    @Test
    void test07() {
        assertTrue(cruiseShip instanceof CruiseShip);
    }

    @Test
    void test08() {
        assertTrue(cruiseShip instanceof Ship);
    }

    @Test
    void test09() {
        assertEquals("Blazer", cruiseShip.getName());
    }

    @Test
    void test10() {
        assertEquals(2022, cruiseShip.getYearBuilt());
    }

    @Test
    void test11() {
        assertEquals(1000, cruiseShip.getMaxPassengers());
    }

    @Test
    void test12() {
        assertEquals("Name: Blazer, max passengers: 1000", cruiseShip.toString());
    }

    @Test
    void test13() {
        cruiseShip.setName("Speedstar");
        assertEquals("Speedstar", cruiseShip.getName());
    }

    @Test
    void test14() {
        cruiseShip.setYearBuilt(2020);
        assertEquals(2020, cruiseShip.getYearBuilt());
    }

    @Test
    void test15() {
        cruiseShip.setMaxPassengers(2000);
        assertEquals(2000, cruiseShip.getMaxPassengers());
    }

    @Test
    void test16() {
        assertEquals("Name: Speedstar, max passengers: 2000", cruiseShip.toString());
    }

    @Test
    void test17() {
        assertTrue(cargoShip instanceof CargoShip);
    }

    @Test
    void test18() {
        assertTrue(cargoShip instanceof Ship);
    }

    @Test
    void test19() {
        assertEquals("Heavy Lifter", cargoShip.getName());
    }

    @Test
    void test20() {
        assertEquals(1989, cargoShip.getYearBuilt());
    }

    @Test
    void test21() {
        assertEquals(10, cargoShip.getCapacityInTons());
    }

    @Test
    void test22() {
        cargoShip.setName("Workhorse");
        assertEquals("Workhorse", cargoShip.getName());
    }

    @Test
    void test23() {
        cargoShip.setYearBuilt(1990);
        assertEquals(1990, cargoShip.getYearBuilt());
    }

    @Test
    void test24() {
        cargoShip.setCapacityInTons(12);
        assertEquals(12, cargoShip.getCapacityInTons());
    }

    @Test
    void test25() {
        assertEquals("Name: Workhorse, cargo capacity (tons): 12", cargoShip.toString());
    }
}
