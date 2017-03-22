/**
 * This example is based on example from the book:
 * 
 * Pragmatic Unit Testing in Java with JUnit by:
*  Andy Hunt
*  Dave Thomas
* 
*  All rights belong to the authors of the book.
 */
package transition.technologies.unittesting.basic.exercises;

public class AVTransport {
	/**
	 * Move the current position ahead by this many seconds. Fast-forwarding
	 * past end-of-tape leaves the position at end-of-tape
	 */
	public void fastForward(float seconds) {
		
	}

	/**
	 * Move the current position backwards by this many seconds. Rewinding past
	 * zero leaves the position at zero
	 */
	public void rewind(float seconds) {
		
	}

	/**
	 * Return current time position in seconds
	 */
	public float currentTimePosition() {
		return 0;
	}

	/**
	 * Mark the current time position with this label
	 */
	public void markTimePosition(String name) {
		
	}

	/**
	 * Change the current position to the one associated with the marked name
	 */
	public void gotoMark(String name) {
		
	}
}