package com.technologies.transition.codesmells.refusedbequest;

import java.util.ArrayList;

public class CustomStack extends ArrayList {

	public void push(Object element) {
		add(0, element);
	}

	public Object pop() {
		Object result = get(0);
		remove(0);
		return result;
	}
	
	@Override
	public Object get(int index) {
		throw new RuntimeException("not allowed");
	}

}
