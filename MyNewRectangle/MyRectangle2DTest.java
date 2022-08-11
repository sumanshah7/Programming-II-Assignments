import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Mobile Apps and Open Source
 * A test of {@link MyRectangle2D}
 *
 * @author Brian Borowski
 * @version 1.0
 */
public class MyRectangle2DTest {
	MyRectangle2D rect1;
	MyRectangle2D rect2;

	@Before
	public void setUp() throws Exception {
		rect1 = new MyRectangle2D(2, 3, 5.5, 4.9);
		rect2 = new MyRectangle2D(4, 5, 10.5, 3.2);
	}

	/**
	 * Test of getX() and setX().
	 */
	@Test
	public final void testGetSetX() {
		double getX = rect1.getX();
		assertEquals(2, getX, 0.001);
		rect1.setX(5);
		assertEquals(5, rect1.getX(), 0.001);

	}

	/**
	 * Test of getY() and setY().
	 */
	@Test
	public final void testGetSetY() {
		double getY = rect1.getY();
		assertEquals(3, getY, 0.001);
		rect1.setY(5);
		assertEquals(5, rect1.getY(), 0.001);

	}

	/**
	 * Test of getWidth() and setWidth().
	 */
	@Test
	public final void testGetSetWidth() {
		double getWidth = rect1.getWidth();
		assertEquals(5.5, getWidth, 0.001);
		rect1.setWidth(5);
		assertEquals(5, rect1.getWidth(), 0.001);
	}

	/**
	 * Test of getHeight() and setHeight().
	 */
	@Test
	public final void testGetSetHeight() {
		double getHeight = rect1.getHeight();
		assertEquals(4.9, getHeight, 0.001);
		rect1.setHeight(5);
		assertEquals(5, rect1.getHeight(), 0.001);
	}

	/**
	 * Test of getArea().
	 */
	@Test
	public final void testArea() {
		double area = rect1.getArea();
		assertEquals(26.95, area, 0.001);
	}

	/**
	 * Test of getPerimeter().
	 */
	@Test
	public final void testPerimeter() {
		double per = rect1.getPerimeter();
		assertEquals(20.8, per, 0.001);
	}

	/**
	 * Test of overlaps().
	 */
	@Test
	public final void testOverlap() {
		boolean overlap = rect1.overlaps(rect2);
		assertEquals(true, overlap);
	}

	/**
	 * Test of contains(double x, double y).
	 */
	@Test
	public final void testContains1() {
		boolean contains1 = rect1.contains(3,3);
		assertEquals(true, contains1);
	}

	/**
	 * Test of contains(MyRectangle2D rect).
	 */
	@Test
	public final void testContains2() {
		boolean contains2 = rect1.contains(rect2);
		assertEquals(false, contains2);
	}

	/**
	 * Test of the default constructor.
	 */
	@Test
	public final void testBlankConstructor() {
		MyRectangle2D rect3 = new MyRectangle2D();
		assertEquals(0, rect3.getX(), 0.001);
		assertEquals(0, rect3.getY(), 0.001);
		assertEquals(1, rect3.getWidth(), 0.001);
		assertEquals(1, rect3.getHeight(), 0.001);
	}
}
