package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapToDoubleDemo1 {

	public static void main(String[] args) {
		double[] d1 = new double[] { 14.1, 78.23, 45.69, 73.89 };
		double[] d2 = new double[] { 47.8, 21.78, 62.14, 96.84 };
		double[] d3 = new double[] { 89.1, 36.83, 89.69, 23.78 };

		List<double[]> doubleArray = Arrays.asList(d1, d2, d3);
		DoubleStream doublestream = doubleArray.stream().flatMapToDouble(array -> Arrays.stream(array));
		doublestream.forEach(System.out::println);

	}

}
