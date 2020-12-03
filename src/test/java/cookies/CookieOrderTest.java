package cookies;

import static org.junit.Assert.*;
import org.junit.Test;

public class CookieOrderTest {

	@Test
	public void shouldInstantiateACookieObjectWithVarietyAndBoxes() {
		CookieOrder underTest = new CookieOrder("",0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnCookieVarietyAsTagalongs() {
		CookieOrder underTest = new CookieOrder("Tagalongs",0);
		String check = underTest.getVariety();
		assertEquals("Tagalongs",check);
	}
	
	@Test
	public void shouldReturnNumberOfBoxesAsOne() {
		CookieOrder underTest = new CookieOrder("Tagalongs",4);
		int check = underTest.getNumBoxes();
		assertEquals(4,check);
	}



}
