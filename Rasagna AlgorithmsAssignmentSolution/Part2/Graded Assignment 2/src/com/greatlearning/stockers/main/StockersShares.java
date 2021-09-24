package com.greatlearning.stockers.main;

import java.util.Scanner;

import com.greatlearning.stockers.MergeSortImplementation;
import com.greatlearning.stockers.SearchImplementation;

public class StockersShares {
	
	private static Scanner sc = new Scanner(System.in);
	public static boolean status;
	
	
	public static void main(String[] args) {
		
		double shareprice[],KEYVALUE;
		boolean stockvalue[];
		int COMPANIES,i,priceIncline,priceDecline,option = 0;
         //get the number of companies
		System.out.println("Enter the no of Companies:");
		COMPANIES = sc.nextInt();
		
		//allocate array to hold share price and stock value comparison
		shareprice = new double[COMPANIES];
		stockvalue = new boolean[COMPANIES];
		
		//get the stock price of company in loop
		for (i = 0; i < COMPANIES; i++) 
		{
			System.out.println("Enter current Stock price of the company "+(i+1)+":");
			shareprice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockvalue[i] = sc.nextBoolean();
		}
		
	
		//sort 
		MergeSortImplementation ms = new MergeSortImplementation();
		//search
		SearchImplementation si = new SearchImplementation();
				priceIncline = 0;
				priceDecline = 0;
				
		for (i = 0; i < COMPANIES; i++) 
			{
					if (stockvalue[i] == true) {
						priceIncline= priceIncline+1;
					}else {
						priceDecline= priceDecline+1;
					}		
				}		
		
		do{
		userOperations();
		
		 option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("Exited Successfully");
				break;
			case 1:
				System.out.println("stock prices in ascending order are:");
				ms.sort(shareprice,0,shareprice.length -1, 1);
				ms.displayArray(shareprice);
			    break;
			case 2:
				System.out.println("stock prices in descending order are:");
				ms.sort(shareprice,0,shareprice.length -1, 2);
				ms.displayArray(shareprice);
			    break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today: "+priceIncline);
			    break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today: "+priceDecline);
				break;
			case 5:
				System.out.println("enter the key value:");
				KEYVALUE = sc.nextDouble();
				si.searchValue(shareprice, KEYVALUE);
				break;
			}
	
		}while(option!=0 && option < 6);
		if (option > 6)
			System.out.println("You have entered invalid option!!");

	}
		
	

private static void userOperations() {
	
	//display the USER Menu operations
	System.out.println("-----------------------------------------------");
	System.out.println("Enter the operation that you want to perform");
	System.out.println("1. Display the companies stock prices in ascending order");	
	System.out.println("2. Display the companies stock prices in descending order");	
	System.out.println("3. Display the total no of companies for which stock prices rose today");	
	System.out.println("4. Display the total no of companies for which stock prices declined today");	
	System.out.println("5. Search a specific stock price");
	System.out.println("6. press 0 to exit");
	System.out.println("-----------------------------------------------");
}
}