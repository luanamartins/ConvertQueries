package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFailure 
{

	@Test
	public void test() 
	{
//		fail("Not yet implemented");
		assertFalse(false);
	}

	@Test
	public void parse()
	{
		assertTrue(true);
	}
}
