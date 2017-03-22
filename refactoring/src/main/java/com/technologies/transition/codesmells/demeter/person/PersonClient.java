package com.technologies.transition.codesmells.demeter.person;

public class PersonClient {

	private Person person;
	
	public PersonClient(Person person) {
		super();
		this.person = person;
	}

	public static void main(String[] args) {	
		new PersonClient(new Person());
	}
	
	public void movePersonForward() {
		person.getLeftLeg().moveForward(0.75);
		person.getRightReg().moveForward(1.2);
		person.getLeftLeg().moveForward(1);
		person.getRightReg().moveForward(0.8);
	}
	
	public void feedPerson(Food food) {
		person.getStomach().putIn(food);
	}
	
	
}
