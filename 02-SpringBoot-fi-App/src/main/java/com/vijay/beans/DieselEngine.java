package com.vijay.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("DieselEngine start() method Called");
		return 0;
	}

}
