package com.vijay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private IEngine eng;

	@Autowired
	public Car(@Qualifier("petrolEngine") IEngine eng) {
		System.out.println("Car :: parametrised Constructor");
		this.eng = eng;
	}

	@Autowired
	@Qualifier(value = "dieselEngine")
	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public Car() {
		System.out.println("Car :: 0-arg Constructor");
	}

	public void drive() {
		int status = eng.start();
		if (status == 0)
			System.out.println("Car Drive Method is called");
	}
}
