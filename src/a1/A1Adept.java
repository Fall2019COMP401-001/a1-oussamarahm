package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Variable for number of items in the store.
		
		int storeitems = scan.nextInt();
		
		// Array to store items names in store.
		
		String[] items = new String[storeitems];
		
		// Array to store costs of items in store.
		
		double[] costs = new double[storeitems];
		
		// For loop to cycle through items listed in the input.
		
		for (int i = 0; i < storeitems; i++) {
			items[i] = scan.next();
			costs[i] = scan.nextDouble();
		}
		
		// Variable for number of customers.
		
		int customers = scan.nextInt();
		
		// Array for names of customers.
		
		String[] names = new String[customers];
		
		// Array for total amounts spent by each customer.
		
		double[] totalpurchase = new double[customers];
		
		// For loop to cycle through list of customers and their purchases.
		
		for (int i = 0; i < customers; i++) {
			
			// Variables for first and last names.
			
			String firstname = scan.next();
			String lastname = scan.next();
			
			// Variable for full name.
			
			String fullname = firstname + " " + lastname;
			
			// Store name in "names" array.
			
			names[i] = fullname;
			
			// Variable for number of purchases by customer.
			
			int purchases = scan.nextInt();
			
			// For loop to cycle through purchases.
			
			for (int j = 0; j < purchases; j++) {
				
				// Variable for quantity purchased of individual item. 
				
				int quantity = scan.nextInt();
				
				// Variable for name of product.
				
				String product = scan.next();
				
				// For loop to find the index of the product in the items array.
				
				int index  = 0;
				
				for (int k = 0; k < items.length; k++) {
					if (product.compareTo(items[k]) == 0) {
						index = k;
					}
				}
				
				// Use index of item in items array to find cost of product in costs array.
				
				double costofproduct = costs[index];
				
				// Calculate total amount spent on product.
				
				double producttotal = costofproduct * quantity;
				
				// Store that amount in "total purchase" array.
				
				totalpurchase[i] += producttotal;
				
			}
			
		}
		
		// Compare purchase amounts to find index of biggest purchase.
		
		int maxindex = 0;
		double max = 0;
		
		for (int a = 0; a < totalpurchase.length; a++) {
			if (totalpurchase[a] > max) {
				max = totalpurchase[a];
				maxindex = a;
			}
		}
		
		String newmax = String.format("%.2f", max);
		// Biggest output line.
		
		System.out.println("Biggest: " + names[maxindex] + " (" + newmax + ")");
		
		// Compare purchase amounts to find index of smallest purchase.
		
		int minindex = 0;
		double min = Integer.MAX_VALUE;
		
		for (int b = 0; b < totalpurchase.length; b++) {
			if (totalpurchase[b] < min) {
				min = totalpurchase[b];
				minindex = b;
			}
		}	
		
		String newmin = String.format("%.2f", min);
		// Smallest output line.
		
		System.out.println("Smallest: " + names[minindex] + " (" + newmin + ")");
		
		// Find average total purchase amount.
		
		double sum = 0.00;
		
		for (int c = 0; c < totalpurchase.length; c++) {
			sum += totalpurchase[c];
		}
		
		double average = sum / totalpurchase.length;
		
		String newaverage = String.format("%.2f", average);
		// Average output line.
		
		System.out.println("Average: " + newaverage);
		
	
	}
}











