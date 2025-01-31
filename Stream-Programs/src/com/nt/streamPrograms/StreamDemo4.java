package com.nt.streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,21);
		//numbers.stream().filter(n -> n > 20).forEach(System.out::println);
		
		//Without Stream
		
		List<Integer> listEven=new ArrayList<Integer>();
		for(Integer i: numbers) {
			if(i%2==0)
			{
				listEven.add(i);
			}
			
		}
		System.out.println(listEven);
		
		System.out.println("----------------------------------------");
		
		//By using Stream API
		System.out.println("Using for Each method");
		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
		System.out.println("----------------------------------------");
		System.out.println("Using Collectors.toList()");
		List<Integer> listOfEven=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
		listOfEven.forEach(System.out::println);
	}

}
