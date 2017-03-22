package com.technologies.transition.codesmells.codenvy;


public class MailSender {
	
	String message;

	public MailSender(String message) {
		super();
		this.message = message;
	}
	
	public void sendToAddress(Adress adress) {
		
		String mailAdressForPostOffice = adress.createPostalOfficeMailAddress();
		
		sendMail(mailAdressForPostOffice);
	}



	private void sendMail(String mailAdressForPostOffice) {
		// ... send email...
	}


}
