package com.technologies.transition.solid.interfacesegregationprinciple.goodex;

class Dialler {
	
    public void makeCall(Dialable dialable) {
    	
    	String telephone = dialable.getTelephone();
    	
    	// call using telephone
    }
}