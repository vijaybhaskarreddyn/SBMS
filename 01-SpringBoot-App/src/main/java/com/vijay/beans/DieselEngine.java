package com.vijay.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine start method is called");
		return 0;
	}

}
