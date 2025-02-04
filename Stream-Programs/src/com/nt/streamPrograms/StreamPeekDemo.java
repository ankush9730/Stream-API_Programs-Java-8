package com.nt.streamPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeekDemo {

	public static void main(String[] args) {
		Stream<String> numbers = Stream.of("Apple", "Mango", "Grapes", "Kiwi", "pomogranate");

		List<Integer> doubledNumbers = numbers
				.peek(str -> System.out.println("Peeking from Original: " + str.toUpperCase()))
				.map(num -> num.length())
				.collect(Collectors.toList());
		System.out.println("-----------------");
		System.out.println(doubledNumbers);
	}

}
