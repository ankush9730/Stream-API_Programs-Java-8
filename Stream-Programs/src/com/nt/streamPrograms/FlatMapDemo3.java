package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private Integer productId;
	private List<String> listOfProduct;

	public Product(Integer productId, List<String> listOfProduct) {
		super();
		this.productId = productId;
		this.listOfProduct = listOfProduct;
	}

	public Integer getProductId() {
		return productId;
	}

	public List<String> getListOfProduct() {
		return listOfProduct;
	}

}

public class FlatMapDemo3 {

	public static void main(String[] args) {

		List<Product> listOfProduct = Arrays.asList(
				new Product(1, Arrays.asList("Camera", "Mobile", "Laptop")),
				new Product(2, Arrays.asList("Bat", "Ball", "Wicket")),
				new Product(3, Arrays.asList("Chair", "Table", "Lamp")),
				new Product(4, Arrays.asList("Cycle", "Bike", "Car"))
				);

		List<String> collect = listOfProduct.stream().flatMap(p -> p.getListOfProduct().stream())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
