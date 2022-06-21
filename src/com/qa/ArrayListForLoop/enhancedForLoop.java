package com.qa.ArrayListForLoop;

import java.util.List;



public class enhancedForLoop {
	public void questionOne() {
		
	List<String>arrayOfStrings =  new ArrayList<>();

	arrayOfStrings.add("Tom");
	
	for(String  value : arrayOfStrings) {
			System.out.println(value);
		}
		

	}


      public void questionTwo() {
    	  int[]myIntArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    	  
    	  
      for(Integer value: myIntArray);{
    	  System.out.println(value*value);
      
      }
