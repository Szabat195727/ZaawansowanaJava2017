package com.technologies.transition.solid.singleresponsibilityprinciple;

public class Location {

	private String rowLocator;
	private int indexOnShelf;
	private String libraryRoomName;

	/**
     * Gives the library name
     * 
     * @return
     */
    public String libraryRoomName() {
    	return libraryRoomName;
    }
    
    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
    	return rowLocator;
    }
    
    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
    	return indexOnShelf;
    }
	
}
