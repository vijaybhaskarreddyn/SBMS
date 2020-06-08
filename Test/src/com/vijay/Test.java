package com.vijay;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws Exception {

		Class clz = Class.forName("com.vijay.Demo");

		Object obj = clz.newInstance();
		Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		//field.set(obj, 25);
		System.out.println(field.get(obj));

	}
}
