package com.technologies.transition.codesmells.demeter.person;

public class Person {

	private Lungs lungs;
	
	private Heart heart;
	
	private Leg leftLeg;
	
	private Leg rightReg;
	
	private Stomach stomach;

	public Person() {
		lungs = new Lungs();
		heart = new Heart();
		leftLeg = new Leg();
		rightReg = new Leg();
		stomach = new Stomach();
	}
	
	public Lungs getLungs() {
		return lungs;
	}

	public void setLungs(Lungs lungs) {
		this.lungs = lungs;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Leg getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(Leg leftLeg) {
		this.leftLeg = leftLeg;
	}

	public Leg getRightReg() {
		return rightReg;
	}

	public void setRightReg(Leg rightReg) {
		this.rightReg = rightReg;
	}

	public Stomach getStomach() {
		return stomach;
	}

	public void setStomach(Stomach stomach) {
		this.stomach = stomach;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heart == null) ? 0 : heart.hashCode());
		result = prime * result + ((leftLeg == null) ? 0 : leftLeg.hashCode());
		result = prime * result + ((lungs == null) ? 0 : lungs.hashCode());
		result = prime * result
				+ ((rightReg == null) ? 0 : rightReg.hashCode());
		result = prime * result + ((stomach == null) ? 0 : stomach.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (heart == null) {
			if (other.heart != null)
				return false;
		} else if (!heart.equals(other.heart))
			return false;
		if (leftLeg == null) {
			if (other.leftLeg != null)
				return false;
		} else if (!leftLeg.equals(other.leftLeg))
			return false;
		if (lungs == null) {
			if (other.lungs != null)
				return false;
		} else if (!lungs.equals(other.lungs))
			return false;
		if (rightReg == null) {
			if (other.rightReg != null)
				return false;
		} else if (!rightReg.equals(other.rightReg))
			return false;
		if (stomach == null) {
			if (other.stomach != null)
				return false;
		} else if (!stomach.equals(other.stomach))
			return false;
		return true;
	}
	
	
	
}
