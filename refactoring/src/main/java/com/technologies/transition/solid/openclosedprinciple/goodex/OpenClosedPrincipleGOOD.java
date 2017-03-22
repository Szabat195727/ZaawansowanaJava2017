package com.technologies.transition.solid.openclosedprinciple.goodex;

public class OpenClosedPrincipleGOOD {

	public double calcualateSpeedLimitFine(String stateCode, int speed) {
		UsaState usaState = UsaStateFactory.getStateForStateCode(stateCode);
		return usaState.calculateSpeedLimitFine(speed);
	}
	
}
