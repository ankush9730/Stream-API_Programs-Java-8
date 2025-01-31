package com.nt.streamPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo8 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> cubeOfNum=numbers.stream().filter(n->n%2==0).map(x->x*x*x).collect(Collectors.toList());
		System.out.println(cubeOfNum);
		System.out.println("----------------------------------------");
		
		List<String> listOfString=List.of("Raj","Rahul","Hyderabad", "ArrayIndexOutOfBoundsException");
		
		listOfString.stream().map(str->str.toUpperCase()).forEach(System.out::println);
	}

}