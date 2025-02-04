package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;

public class StreamSortedDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(89, 56, 12, 58, 90, 34);
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("---------------------");
		numbers.stream().sorted((i1, i2) -> i2 - i1).forEach(System.out::println);
	}

}
