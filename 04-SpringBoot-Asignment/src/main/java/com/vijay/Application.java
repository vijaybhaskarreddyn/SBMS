package com.vijay;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vijay.model.Product;
import com.vijay.service.ProductsDataReader;
import com.vijay.service.ProductsDataWriter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ProductsDataReader dataReader = ctx.getBean(ProductsDataReader.class);
		List<Product> productList = dataReader.readDataFromFile();
		System.out.println("product List those price having greater than five thousand (>5000.00)" + productList);
		ProductsDataWriter dataWriter = ctx.getBean(ProductsDataWriter.class);
		String status = dataWriter.writeDateIntoFile(productList);
		System.out.println(status);
	}

}
