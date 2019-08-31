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
			
			// Array to store money spent on each item.
			
			double[] totalcosts = new double[purchases];
			
			// For loop to cycle through purchases.
			
			for (int j = 0; j < purchases; j++) {
				
				// Variable for quantity purchased of individual item. 
				
				int quantity = scan.nextInt();
				
				// Variable for name of product.
				
				String product = scan.next();
				
				// Variable for index of product in the items array.
				
				int index  = 0;
				
				// For loop to find the index of the product in the items array.
				
				for (int k = 0; k < items.length; k++) {
					if (product == items[k]) {
						index = k;
						break;
					}
				}
				
				// Use index of item in items array to find cost of product in costs array.
				
				double costofitem = costs[index];
				
				// Calculate total amount spent on product.
				
				double producttotal = costofitem * quantity;
				
				// Store that amount in "total purchase" array.
				
				totalpurchase[i] += producttotal;
				// HEREEEE Delete totalcosts array
				
				// totalcosts[j] = costofitem;
				
			}
			
			// For loop to calculate total amount spent by that customer.
			
			// double totalspent = totalcosts[0];
			
			// for (int l = 1; l < totalcosts.length; l++) {
				
			//	totalspent += totalcosts[l];
				
			// }
			
			
			// Store the amount spent by the customer in "total purchase" array at the same index of the respective customer in the "names" array.
			
			// totalpurchase[i] += totalspent;
			
		}
		
		// Compare purchase amounts to find index of biggest purchase.
		
		int maxindex = 0;
		double max = 0;
		
		for (int i = 0; i < totalpurchase.length; i++) {
			double a = totalpurchase[i];
			if (a > max) {
				max = a;
				maxindex = i;
			}
		}
		
		String newmax = String.format("%.2f", max);
		
		// Variable for Biggest output line.
		
		String biggest = "Biggest: " + names[maxindex] + " (" + newmax + ")";
		
		// Compare purchase amounts to find index of smallest purchase.
		
		int minindex = 0;
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < totalpurchase.length; i++) {
			double a = totalpurchase[i];
			if (a < min) {
				min = a;
				minindex = i;
			}
		}
		
		String newmin = String.format("%.2f", min);
		
		// Variable for Smallest output line.
		
		String smallest = "Smallest: " + names[minindex] + " (" + newmin + ")";
		
		// Find average total purchase amount.
		
		double sum = totalpurchase[0];
		
		for (int i = 1; i < totalpurchase.length; i++) {
			sum += totalpurchase[i];
		}
		
		double averagenum = sum / totalpurchase.length;
		String newaverage = String.format("%.2f", averagenum);
		
		// Variable for Average output line.
		String average = "Average: " + newaverage;
		
		
		System.out.println(biggest);
		System.out.println(smallest);
		System.out.println(average);
		
	}
}











