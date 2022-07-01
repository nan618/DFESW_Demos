package com.qa.streams;
import java.util.*;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> myNamesList=Arrays.asList("Michael", "Dean", "James", "Chris");
		Stream<String> myNamesStream = myNamesList.stream();
		
		myNamesStream.filter(names -> ! names.contains("James")).forEach(value -> System.out.println("Hello " +value));
		
		List<Integer> myIntList = new ArrayList<>();
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(7);
		myIntList.add(8);
		myIntList.add(12);
		List<Integer> listOfInts = List.of (3,4,7,8,12);
		Stream<Integer>streamOfInts = ListOfInts.stream();
		int product = streamOfInts.reduce(num1,num2) -> num1*num2).get();
		System.out.print(product);
		
		List<Integer> list = Arrays.asList(3, 4, 7, 8, 12);
		  
        System.out.print("The maximum value is : ");
  
        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().max(Integer::compare).get();
  
        System.out.print(var);
        Integer var = list.stream().min(Integer::compare).get();
        
        System.out.print(var);
        
        for (int i=0;i<number.size();i++){      
            int even=number.get(i)%2;       
             if (even==0){
                 System.out.println("This is Even Number:"+ number.get(i));
                 number.remove(i);
        for (int i = start; i <= end; i++) {
             if (i % 2 != 0) {System.out.println("This is Odd Number:"+ number.get(i));
             number.remove(i);
             
             int sum = myIntStream.reduce((num1, num2) -> num1 + num2).get();
     		System.out.println(sum);
              
                 
             }    
         

         Collections.sort(number);
         System.out.println("Sorted List: "+number);
       
        }
             }
             
        }}}
        
         

      
        
    
	
    

	


