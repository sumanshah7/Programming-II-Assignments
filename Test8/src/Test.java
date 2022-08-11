
public class Test {

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
	    another.setMonthNumber(7);
	    assertFalse(month.equals(another));
	    assertFalse(another.equals(month));
	}

	
}
