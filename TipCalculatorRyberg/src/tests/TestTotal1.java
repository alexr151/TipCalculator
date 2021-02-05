package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.TipCalculator;

public class TestTotal1 {
	double total = 50.0;
	double tipExpected = 10.0;
	TipCalculator tp = new TipCalculator(total);
	

	@Before
	public void setUp() throws Exception {
		tp.setTipTotal(total);
	}

	@Test
	public void testTotalTrue() {
		System.out.println("Test Total True");
		assertEquals(tipExpected, tp.getTipTotal(), 1.0);
	}
	
	@Test
	public void testTotalFalse() {
		System.out.println("Test Tip False");
		assertTrue((total * 0.2) == tp.getTipTotal());
	}
	
}
