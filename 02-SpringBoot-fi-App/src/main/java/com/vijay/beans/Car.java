package com.vijay.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private IEngine eng;

	public Car() {
		System.out.println("Car :: constructor");
	}

	public void drive() {
		int status = eng.start();
		if (status == 0) {
			System.out.println("Journey Started");
		}

	}
}
