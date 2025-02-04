package com.nt.streamPrograms;

import java.util.stream.Stream;

public class StreamSkipDemo {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(11, 12, 15, 16, 13, 14);
		s1.skip(1).forEach(System.out::println);
	}

}
