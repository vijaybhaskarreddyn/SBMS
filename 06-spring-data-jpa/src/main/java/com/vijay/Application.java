package com.vijay;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

		/*
		 * List<ContactsMasterEntity> entities =
		 * bean.findByContactNameAndContactNumber("VijayaBhaskarReddy", 123459048);
		 * entities.forEach(entity -> { System.out.println(entity); });
		 */

		/*
		 * Optional<ContactsMasterEntity> entity = bean.findById(101);
		 * System.out.println(entity);
		 */

		Iterable<ContactsMasterEntity> entities = bean.findAllById(Arrays.asList(101, 102));
		entities.forEach(entity -> {
			System.out.println(entity);
		});
		/*
		 * ContactsMasterEntity entity = bean.findByContactName("VijayaBhaskarReddy");
		 * System.out.println(entity);
		 */
		
		
		/*
		 * Iterable<ContactsMasterEntity> entities = bean.findAll();
		 * entities.forEach(entity -> { System.out.println(entity); });
		 */

		
		
		/*
		 * System.out.println("++++++======>  " + bean.getClass().getName());
		 * ContactsMasterEntity entity = new ContactsMasterEntity(103, "VijayaBhaskar",
		 * 123459048); bean.save(entity);
		 * System.out.println("Total No.Of Records in table " + bean.count());
		 * System.out.println("Entity Saved Sucessfully " + entity.toString());
		 */
		ctxt.close();
	}

}
