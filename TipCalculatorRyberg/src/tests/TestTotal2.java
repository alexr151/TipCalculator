package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.TipCalculator;

public class TestTotal2 {
	
	double total = 50.0;
	double tipExpected = 10.0;
	TipCalculator tp = new TipCalculator(total);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNotNull() {
		System.out.println("Test Tip Not Null");
		assertNotNull(tp.getTipTotal());
	}
	
	@Test
	public void testMessageOutput() {
		System.out.println("Test Tip Output");
		assertEquals("Total Sales: $" + total + "\nTotal in Tips: $" + tp.getTipTotal() + "\nTotal: $" + (total + tp.getTipTotal()), tp.outputTip());
	}
}


