import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void testNotTriangle() {
		Triangle temp = new Triangle();
		String rTest = new String();
		rTest = temp.Triangle(1,1,3);
		assertEquals("Triangle", rTest);
	}
	
	@Test
	public void testEquilateral() {
		Triangle temp = new Triangle();
		String rTest = new String();
		rTest = temp.Triangle(1,1,1);
		assertEquals("Equilateral", rTest);
	}
	
	@Test
	public void testIsosceles() {
		Triangle temp = new Triangle();
		String rTest = new String();
		rTest = temp.Triangle(2,3,3);
		assertEquals("Isosceles", rTest);	
	}
	
	@Test
	public void testScalene() {
		Triangle temp = new Triangle();
		String rTest = new String();
		rTest = temp.Triangle(2,3,4);
		assertEquals("Isosceles", rTest);
		
	}
	
	

}
