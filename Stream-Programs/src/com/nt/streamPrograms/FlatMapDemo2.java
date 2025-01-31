package com.nt.streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> asList=Arrays.asList("Joty","Ankit","Vaibhav","Aman");
		asList.stream().flatMap(str->Stream.of(str.charAt(0))).forEach(ch->System.out.print(ch));
	}

}
