package com.poc;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		Stream<String> strArr = Stream.of("Test","Car");
		strArr.sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p));
	}
	
	

}
