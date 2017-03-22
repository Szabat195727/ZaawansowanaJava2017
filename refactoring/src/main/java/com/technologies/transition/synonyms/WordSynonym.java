package com.technologies.transition.synonyms;

import java.util.LinkedList;
import java.util.List;

public class WordSynonym {
	
	String word;
	
	List<String> meaningList = new LinkedList<>();
	
	List<String> synonymsList = new LinkedList<>();
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public List<String> getMeaningList() {
		return meaningList;
	}

	public List<String> getSynonymsList() {
		return synonymsList;
	}

	public WordSynonym(String word) {
		this.word = word;
	}
	
	public void setMeaningList(List<String> meaningList) {
		this.meaningList = meaningList;
	}

	public void setSynonymsList(List<String> synonymsList) {
		this.synonymsList = synonymsList;
	}




}
