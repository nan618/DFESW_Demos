package com.qa.streams;
import java.util.*;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> myNamesList=Arrays.asList("Michael", "Dean", "James", "Chris");
		Stream<String> myNamesStream = myNamesList.stream();
		
		myNamesStream.filter(names -> ! names.contains("James")).forEach(value -> System.out.println("Hello " +value));
		
		//.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		
	}

}
