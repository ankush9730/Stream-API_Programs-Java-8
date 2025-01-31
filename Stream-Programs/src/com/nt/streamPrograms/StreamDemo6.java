package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;

public class StreamDemo6 {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Ravi","Rahul","Akshar","Roshan","Raj","Ankit","Ravi");
		list.stream().filter(n->n.startsWith("R")).sorted().distinct().forEach(System.out::println);
		
		//Stream<String> name= Stream.of("Ravi","Rahul","Akshar","Roshan","Raj","Ankit","Ravi");
		 //name.filter(n->n.startsWith("R")).sorted().distinct().forEach(System.out::println);
	}

}
