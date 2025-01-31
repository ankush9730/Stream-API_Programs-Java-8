package com.nt.streamPrograms;

import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		// Stream Of Collection
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		stream.forEach(p -> System.out.println(p));

		System.out.println("-----------------------------------");

		// Anonymous Array Object(Stream of Arrays)

		Stream<Integer> stm = Stream.of(new Integer[] { 15, 45, 8, 16 });
		stm.forEach(p -> System.out.println(p));
	}

}

