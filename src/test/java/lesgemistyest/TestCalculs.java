package lesgemistyest;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import lesgemiscalcul.Calculs;

public class TestCalculs {
	
	
	private Calculs subject;

	@Before
	public void setup() {
		subject = new Calculs();
	}
	
	@Test
	public void testGetMessage() {
		
		//assertTrue("verifier", subject.addition(10,20)==subject.multiplicationn(10,3));
		assertEquals( subject.addition(10,20),subject.multiplicationn(10,3));

	}

	/*@Test
	public void testSum(){
		assertEquals(4, subject.sum(2,2));
	}*/

	}