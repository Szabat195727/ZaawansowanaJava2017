package com.technologies.transition.codesmells.demeter.statusbean;

import java.util.ArrayList;
import java.util.List;

public class StatusBeanClient {

	private StatusBean statusBean = new StatusBean() ;
	
	public static void main(String[] args) {
		StatusBeanClient statusBeanClient = new StatusBeanClient();
		statusBeanClient.exampleAddSomeErrorMessages();
		statusBeanClient.example2AddSomeMoreErrorMessages();
	}

	private void exampleAddSomeErrorMessages() {
		if (statusBean.getErrorMessages() == null) {
			statusBean.setErrorMessages(new ArrayList<>());
		}
		
		statusBean.getErrorMessages().add("error 1");
		statusBean.getErrorMessages().add("error 2");
	}
	
	private void example2AddSomeMoreErrorMessages() {
		if (statusBean.getErrorMessages() == null) {
			statusBean.setErrorMessages(new ArrayList<>());
		}
		
		statusBean.getErrorMessages().add("error 3");
		statusBean.getErrorMessages().add("error 4");
	}
	
	private void clearErrorMessagesExample1() {
		// this should never be done, but are we sure that everyone in the project knows about it?
		// we cannot assume that, hence a nullcheck is ALWAYS necessary when accessing any internal
		// field
		statusBean.setErrorMessages(null);
	}
	
	private void clearErrorMessagesExample2() {
		// what if we would like to log the previous values of the error messages that were in the bean?
		List<String> presiousErrorList = statusBean.getErrorMessages();
		if (presiousErrorList != null) {
			for (String error : presiousErrorList) {
				log(error);
			}
			
		}
	
		statusBean.setErrorMessages(new ArrayList<>());
	}

	private void log(String error) {
		// TODO Auto-generated method stub
		
	}
	
}
