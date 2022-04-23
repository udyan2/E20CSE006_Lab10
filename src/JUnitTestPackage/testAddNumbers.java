package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		int res=junit.addnumbers(50,60);
		assertEquals(110,res);
		
	}

}
