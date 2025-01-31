package com.nt.streamPrograms;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo10 {

	public static void main(String[] args) {
		List<String> list=List.of("apple","mango","ora","balana","graps");
		
		list.stream().flatMap(str -> Stream.of(str.charAt(0))).forEach(ch -> System.out.print(ch));
		 
	}

}
