package transition.technologies.unittesting.basic.fib;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//@RunWith(Parameterized.class)
public class FibonnacciTest {
    
	//@Parameters


    private int fInput;

    private int fExpected;

    public FibonnacciTest(int input, int expected) {
        fInput= input;
        fExpected= expected;
    }
    

    //@Test
    public void test() {
        assertEquals(fExpected, Fibonnacci.compute(fInput));
    }
}