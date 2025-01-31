package com.nt.streamPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		 
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		
		Stream<Integer> s1= list.stream();
		s1.forEach(System.out::println);

	}

}
