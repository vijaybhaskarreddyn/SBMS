package com.vijay.beans;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEnginee :: Constructor");
	}
	@Override
	public int start() {
		System.out.println("Petrol Engine Start() method is called");
		return 0;
	}

}
