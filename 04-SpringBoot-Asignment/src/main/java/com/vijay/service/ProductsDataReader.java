package com.vijay.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.vijay.model.Product;

@Component
public class ProductsDataReader {

	private static final String inputFilePath = "F:\\SBMSSTS\\04-SpringBoot-Asignment\\src\\main\\resources\\input.txt";

	public ProductsDataReader() {
		System.out.println("ProductsDataReader :: constructor");
	}

	public List<Product> readDataFromFile() {

		List<Product> products = new ArrayList<>();
		try (Stream<String> lines = Files.lines(Paths.get(inputFilePath))) {
			List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
			values.forEach(System.out::println);
			// Filter the data as per business condition and add into Collection
			values.stream().filter(value -> new Double(value.get(2)) > 5000.00).forEach(value -> {
				int id = Integer.valueOf(value.get(0));
				String productName = value.get(1);
				double price = new Double(value.get(2));
				products.add(new Product(id, productName, price));
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
		return products;

	}

}
