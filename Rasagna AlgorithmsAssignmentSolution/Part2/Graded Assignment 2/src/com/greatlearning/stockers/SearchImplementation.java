package com.greatlearning.stockers;

public class SearchImplementation {
	public void searchValue(double arr[],double value) {
		boolean status = false ;
			  for (int i=0; i<arr.length; i++) 
			  {
			    if (arr[i] == value)               
			    status = true;
			    break;
			   }
			  if (status == true) {
				  System.out.println("Stock of value " + value + " is present"); 
				  }else {
					  System.out.println("Value not found"); 
				  }
	}
}
