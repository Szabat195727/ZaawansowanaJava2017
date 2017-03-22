package com.technologies.transition.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersProcessor {

	Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
	private int minIntegerValue = Integer.MIN_VALUE;
	private int maxIntegerValue = Integer.MAX_VALUE;
	
	public NumbersProcessor(List<Integer> numbersToAdd) {
		addNumbersToMap(numbersToAdd);
	}
	
	public NumbersProcessor() {
		
	}
	
	public void addNumbersToMap(List<Integer> numbersToAdd) {
		for (int i = 0; i < numbersToAdd.size(); i++) {
			addNumberToMapWithCheckExist(numbersToAdd.get(i));
		}
		
	}
	
	public void addNumberToMapWithCheckExist(Integer key) {
		if (numbersMap.containsKey(key)) {
			Integer k = numbersMap.get(key);
			numbersMap.put(key, k +1);
		} else {
			numbersMap.put(1, 1);
		}
		
		if (key > minIntegerValue) {
			minIntegerValue = key;
		}
		
		if (key < maxIntegerValue) {
			maxIntegerValue = key;
		}
	}
	
	public int returnNumberFromMapByKey (int key) {
		if (numbersMap.containsKey(key)) {
			return numbersMap.get(key);
		} else {
			return 0;
		}
	}
	
	public double getQuotientFromMapValuesAndKeys() {
		
		double sumOfKeyTimesValue = 0;
		double sumOfValue = 0;
		
		for (Entry<Integer, Integer> u : numbersMap.entrySet()) {
			sumOfValue += u.getValue();
			sumOfKeyTimesValue += u.getKey() * u.getValue();
		}
		
		return sumOfKeyTimesValue/sumOfValue;
	}

	
	public int getMinIntegerValue() {
		return minIntegerValue;
	}

	public int getMaxIntegerValue() {
		return maxIntegerValue;
	}

	
	
}
