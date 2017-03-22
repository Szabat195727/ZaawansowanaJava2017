package com.technologies.transition.solid.interfacesegregationprinciple.badex;

class Dialler {
	
    public void makeCall(Contact dialable) {
    	
    	String telephone = dialable.getTelephone();
    	
    	// call using telephone
    }
}