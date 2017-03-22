package transition.technologies.unittesting.basic.collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.Assert.fail;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.aragorn;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.boromir;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.frodo;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.gandalf;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.gimli;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.legolas;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.merry;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.pippin;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.sam;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.sauron;

import org.junit.Test;

public class FellowshipAssertionTest {

    private Fellowship fellowship = formTheFellowshipOfTheRing();

    
    @Test
    public void frodoShouldBeIn() {
    	fail("Not yet implemented");
    }

    @Test
    public void sauronShouldNotBeIn() {
    	fail("Not yet implemented");
    }
    
    @Test
	public void shouldFrodoNameBeCorrectAndNotBeASauronAndBeInFellowship() {
    	fail("Not yet implemented");

	}

    @Test
    public void aragornShouldBeBeforeBoromir() {
    	fail("Not yet implemented");
    }

    @Test
    public void shouldNotContainDuplicatedFellows() {
    	fail("Not yet implemented");
    }

    @Test
    public void shouldContainOnlyFellowsWithExpectedNamesInProperOrder() {
    	fail("Not yet implemented");
    }

    @Test
    public void shouldContainNineFellowsButNoneGiant() {
    	fail("Not yet implemented");
    	
    }
    
    @Test
	public void shouldContainTupleForBoromirSamAndLegolas() {
    	// Extracting multiple values at once (using tuple to group them)
    	// Create tuples with name and race name
    	fail("Not yet implemented");

	}
    
    
    @Test
	public void shouldContaintFourHobbits() {
    	fail("Not yet implemented");

	}


    private Fellowship formTheFellowshipOfTheRing() {
        return new Fellowship(
                frodo(),
                sam(),
                merry(),
                pippin(),
                gandalf(),
                legolas(),
                gimli(),
                aragorn(),
                boromir());
    }
}
