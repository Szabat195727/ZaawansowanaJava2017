package com.technologies.transition.solid.singleresponsibilityprinciple;

public class BookPrinter {
	
	void printCurrentPage(Book book) {
		System.out.println(book.getCurrentPageContents());
	}

}
