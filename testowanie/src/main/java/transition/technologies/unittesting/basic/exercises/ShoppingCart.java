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

import java.util.Iterator;

public class ShoppingCart {
	/**
	 * Add this many of this item to the shopping cart.
	 */
	public void addItems(Item anItem, int quantity)
			throws NegativeCountException {

	}

	/**
	 * Delete this many of this item from the shopping cart
	 */
	public void deleteItems(Item anItem, int quantity)
			throws NegativeCountException, NoSuchItemException {

	}

	/**
	 * Count of all items in the cart (that is, all items x qty each)
	 */
	public int itemCount() {
		return 0;
	}

	/**
	 * Return Iterator of all items (see Java Collections doc)
	 */
	public Iterator iterator() {
		return null;
	}
}
