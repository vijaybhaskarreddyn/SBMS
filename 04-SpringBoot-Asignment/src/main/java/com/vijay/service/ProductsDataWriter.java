package com.vijay.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vijay.model.Product;

@Component
public class ProductsDataWriter {

	private static final String outputFilepath = "F:\\SBMSSTS\\04-SpringBoot-Asignment\\src\\main\\resources\\output.txt";

	public ProductsDataWriter() {
		System.out.println("ProductsDataWriter :: Constructor");
	}

	public String writeDateIntoFile(List<Product> products) {
		products.forEach(product -> System.out.println("This Product is ready for Exporting " + product));
		List<String> list = new ArrayList<String>();
		products.stream().forEach(product -> {
			StringBuilder builder = new StringBuilder();
			builder.append(product.getId());
			builder.append(",");
			builder.append(product.getProductName());
			builder.append(",");
			builder.append(product.getPrice());
			String str = builder.toString();
			list.add(str);
		});
		try {
			Files.write(Paths.get(outputFilepath), list, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Data is exported successfully into file .... ";
	}
}
