package com.technologies.transition.codesmells.instanceofs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Engineer extends Employee{

	private List<String> programmingLanguages = new ArrayList<>();

	public List<String> getProgrammingLanguages() {
		return Collections.unmodifiableList(programmingLanguages);
	}

	public void addProgrammingLanguage(String programmingLanguage) {
		initializeProgrammingLanguagesListIfNecessary();
		programmingLanguages.add(programmingLanguage);		
	}

	private void initializeProgrammingLanguagesListIfNecessary() {
		if (programmingLanguages == null) {
			programmingLanguages = new ArrayList<>();
		}
	}
	
	
}
