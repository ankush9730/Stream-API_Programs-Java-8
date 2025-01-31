package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {
		 List<String> list=Arrays.asList("Sumit","Amit","Ankush","Lahu","Ankush");
		 
		 List<String> name=list.stream().sorted().collect(Collectors.toList());
		 name.forEach(System.out::println);
		// System.out.println(name);
		 
		 

	}

}
