package pl.com.tt.mutants;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagicCalculatorTest {
	
	
private MagicCalculator sut;
	

	@Before
	public void initialize(){
		sut = new MagicCalculator();
	}
	
	
	@Test
	public void shouldAddTwoPositiveNumbers(){
		//given
		//when
		double result = sut.add(2, 3);
		//then
		assertEquals(5, result, 0.00001);
	}
	

	
	@Test
	public void shouldSubstractTwoPositiveNumbers() throws Exception {
		//given
		//when
		double result = sut.subtract(7,4);
		//then
		assertEquals(3, result, 0.00001);
	}
	
	@Test(expected=CannotDivideByZeroException.class)
	public void shouldThrowExceptionWhenDivideByZero() throws Exception {
		//given
		//when
		sut.divide(10, 0);
		
	}
	
	@Test
	public void shouldThrowExceptionWhenDivideByZero_method2() throws Exception {
		//given
		//when
		try {
			sut.divide(10, 0);
			fail("should throw an exception");
		} catch (CannotDivideByZeroException e) {
			String message = e.getMessage();
			// verify message....
			assertTrue(true);
		} catch (Exception e) {
			fail("wring exception thrown: " + e);
		}
	}

	
}

