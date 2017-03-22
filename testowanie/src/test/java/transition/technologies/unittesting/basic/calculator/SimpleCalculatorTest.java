package transition.technologies.unittesting.basic.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

	private SimpleCalculator sut;
	

	@Before
	public void initialize(){
		sut = new SimpleCalculator();
	}
	
	
	@Test
	public void shouldAddTwoPositiveNumbers(){
		//given
		//when
		double result = sut.add(2, 3);
		//then
		assertEquals(5, result, 0.00001);
	}
	
}
