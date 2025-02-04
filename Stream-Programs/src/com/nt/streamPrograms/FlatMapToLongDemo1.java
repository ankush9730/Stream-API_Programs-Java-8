package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapToLongDemo1 {

	public static void main(String[] args) {
		long[] l1 = new long[] { 11, 12, 13 };
		long[] l2 = new long[] { 17, 78, 52 };
		long[] l3 = new long[] { 18, 72, 93 };

		List<long[]> longArray = Arrays.asList(l1, l2, l3);

		LongStream longstream = longArray.stream().flatMapToLong(array -> Arrays.stream(array));
		longstream.forEach(System.out::println);
	}

}
