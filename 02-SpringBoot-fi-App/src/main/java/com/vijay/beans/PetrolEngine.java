package com.vijay.beans;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("PetrolEngine start() method called");
		return 0;
	}

}
