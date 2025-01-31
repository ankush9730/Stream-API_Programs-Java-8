package com.nt.streamPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Customer(int cid, String cname, double custBill) {

}

public class StreamDemo7 {

	public static void main(String[] args) {

		ArrayList<Customer> al = new ArrayList<>();

		al.add(new Customer(1, "Aryan", 27000));
		al.add(new Customer(2, "Bina", 37000));
		al.add(new Customer(3, "Karan", 47000));
		al.add(new Customer(4, "Deepak", 57000));

		// Print all customers records whose Bill is > 30000
		List<Customer> listOfCuatomer = al.stream().filter(cust -> cust.custBill() > 30000)
				.collect(Collectors.toList());
		listOfCuatomer.forEach(System.out::println);
	}

}
