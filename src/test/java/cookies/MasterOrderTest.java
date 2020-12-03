package cookies;

import static org.junit.Assert.*;

import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void shouldInstantiateAMasterOrderObject() {
		MasterOrder underTest = new MasterOrder();
		assertNotNull(underTest);
	}

	@Test
	public void assertThatAnOrderHasBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Thin Mints",0));
		int check = underTest.listSize();
		assertEquals(1,check);
	}

	@Test
	public void assertThatGetTotalBoxesIsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs",2));
		underTest.addOrder(new CookieOrder("Thin Mints",2));
		int check = underTest.getTotalBoxes();
		assertEquals(4,check);
	}


	@Test
	public void assertThatAnOrderHasBeenRemoved() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs",400));
		underTest.addOrder(new CookieOrder("Thin Mints",4));
		underTest.removeVariety("Thin Mints");
		int check = underTest.listSize();
		assertEquals(1,check);
	}

}
