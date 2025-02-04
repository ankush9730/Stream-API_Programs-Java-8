package com.nt.streamPrograms;

import java.util.stream.Stream;

public class StreamLimitDemo {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(15, 78, 11, 16, 23);
		Stream<Integer> limits = numbers.limit(4).sorted();
		limits.forEach(System.out::println);
	}
}
