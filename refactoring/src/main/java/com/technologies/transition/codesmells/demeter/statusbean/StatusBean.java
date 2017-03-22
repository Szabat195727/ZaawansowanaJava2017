package com.technologies.transition.codesmells.demeter.statusbean;

import java.util.List;

public class StatusBean {

	List<String> succcessMessages;
	
	List<String> errorMessages;

	public List<String> getSucccessMessages() {
		return succcessMessages;
	}

	public void setSucccessMessages(List<String> succcessMessages) {
		this.succcessMessages = succcessMessages;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	
}
