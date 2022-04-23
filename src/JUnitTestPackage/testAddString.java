package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Udyan Sharma,","E20CSE006");
		assertEquals("Udyan Sharma,E20CSE006",res);
	}

}
