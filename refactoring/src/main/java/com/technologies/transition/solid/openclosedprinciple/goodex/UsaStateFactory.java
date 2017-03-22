package com.technologies.transition.solid.openclosedprinciple.goodex;

import com.technologies.transition.solid.openclosedprinciple.goodex.usastates.UsaStateAL;
import com.technologies.transition.solid.openclosedprinciple.goodex.usastates.UsaStateGA;
import com.technologies.transition.solid.openclosedprinciple.goodex.usastates.UsaStateSC;

public class UsaStateFactory {

	public static UsaState getStateForStateCode(String stateCode) {

		UsaState usaState;

		switch (stateCode) {
			case "SC": {
				usaState = new UsaStateSC();
				break;
			}
			case "AL": {
				usaState = new UsaStateAL();
				break;
			}
			case "GA": {
				usaState = new UsaStateGA();
				break;
	
			}
			default: {
				throw new RuntimeException("state code not supported: " + stateCode);
			}
		}
		
		return usaState;
	}
}
