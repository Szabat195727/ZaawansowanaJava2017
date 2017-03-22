package com.technologies.transition.solid.interfacesegregationprinciple.goodex;

class InterfaceSegregationPrincipleGOOD {
	
	Emailer emailer;
	Dialler dialler;
	
	public InterfaceSegregationPrincipleGOOD() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrincipleGOOD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleGOOD();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");		
		emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
