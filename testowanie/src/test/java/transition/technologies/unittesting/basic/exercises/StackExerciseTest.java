package transition.technologies.unittesting.basic.exercises;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class StackExerciseTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();

	private StackExercise sut;

	@Before
	public void initializeSut() {
		sut = new StackExercise();		
	}
	
	
	@Test
	public void shouldBeEmptyWhenNothingPushed() {
		fail("Not yet implemented");

	}
	
	
	@Test
	public void shouldTopReturnLastPushedValue() throws StackEmptyException {
		fail("Not yet implemented");
	}

	@Test
	public void shouldNotFailWhen200ElementsPushed() throws StackEmptyException {
		fail("Not yet implemented");
	}
	
	private void pushValuesToStack(int numElements) {
		
		//TODO: Implement filling the stack here
	}
	
	@Test
	public void shouldBeEmptyWhenAllPopped() throws StackEmptyException {
		fail("Not yet implemented");
	}
	
	@Test
	public void shouldThrowStackEmptyExceptionWhenEmptyPopped() throws StackEmptyException {
		fail("Not yet implemented");
	}
	
}
