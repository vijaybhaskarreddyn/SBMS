package com.vijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vijay.entities.ContactsMasterEntity;
import com.vijay.repo.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ContactsMasterRepo bean = ctxt.getBean(ContactsMasterRepo.class);
		System.out.println("++++++======>  " + bean.getClass().getName());
		ContactsMasterEntity entity = new ContactsMasterEntity(103, "VijayaBhaskar", 123459048);
		bean.save(entity);
		//System.out.println("Total No.Of Records in table " + bean.count());
		System.out.println("Entity Saved Sucessfully " + entity.toString());
		ctxt.close();
	}

}
