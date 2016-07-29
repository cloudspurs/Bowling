package cloud.test;

import cloud.Frame;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestThrow {

	@Test
	public void testScoreNoThrows() {
		Frame f = new Frame();
		assertEquals(0, f.getScore());	
	}
	
	@Test
	public void testAddOneThrow() {
		Frame f = new Frame();
		f.add(5);
		assertEquals(5, f.getScore());
	}

}
