package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Variable for number of items available in store.
		
		int numinstore = scan.nextInt();
		
		// Array to hold names of items in store.
		
		String[] itemsinstore = new String[numinstore];
		
		// Array to hold number of times each item is bought (index with respect to "items in store" array).
		
		int[] timesbought = new int[numinstore];
		
		// Array to hold number of customers that bought each respective item.
		
		int[] customers = new int[numinstore];
		
		// For loop to fill in "items in store" array (disregard prices of items).
		
		for (int i = 0; i < itemsinstore.length; i++) {
			itemsinstore[i] = scan.next();
			scan.nextDouble();
		}
		
		// Variable to hold number of customers.
		
		int numofcustomers = scan.nextInt();
		
		// Variable to hold number of items purchased by each customer.
		
		// For loop to cycle through each customer (disregard names of customers).
		
		for (int j = 0; j < numofcustomers; j++) {
			scan.next();
			scan.next();
			
			// Variable to hold number of items purchased by each customer.

			int numofpurchases = scan.nextInt();
			
			// Array to hold indices. 
			
			int[] indices = new int[numofpurchases];
			
			// For loop to cycle through the purchases.
			
			for (int k = 0; k < numofpurchases; k++) {
				
				// Variable to hold amount of individual item purchased.
				
				int itemquantity = scan.nextInt();
				
				// Variable to hold name of item.
				
				String nameofitem = scan.next();
				
				// Variable to hold index of all items.
				
				int itemindex = 0;
				
				// For loop to cycle through "items in store" array to find index of same item.
				
				for (int l = 0; l < itemsinstore.length; l++) {
					if (nameofitem.compareTo(itemsinstore[l]) == 0) {
						itemindex = l;
						break;
					}
				}
				
				// Add the item's index to the indices array.
				
				indices[k] = itemindex;
				
				// Add 1 to that index in the "customers" array to tally how many customers bought that item.
				
				// customers[itemindex] += 1;
				
				// Add "item quantity" variable to "times bought" array to tally how many times that item is bought.
				
				timesbought[itemindex] += itemquantity;
			}
			
			// List to store all indices without repeating.
			
			ArrayList<Integer> indexes = new ArrayList<Integer>(0);
			
			// Cycle through indices to find repeating indices. Add one of each index to indexes list.
			
			for (int z = 0; z < indices.length; z++) {
				
				if (indexes.contains(indices[z])) {
					
				} else {
					indexes.add(indices[z]);
				}
			}
			
			
			// For loop to cycle through list and add 1 to each of the indices of the customers array specified in the new "indexes" list.
			
			for (int x = 0; x < indexes.size(); x++) {
				customers[indexes.get(x)] += 1;
			}
			
			
			
		}
		
		// For loop to cycle through all items in the "items in store" array.
		
		for (int m = 0; m < itemsinstore.length; m++) {
			
			// Variable to hold item name.
			
			String itemname = itemsinstore[m];
			
			// Variable to hold number of times that item was bought.
			
			int itemquantity = timesbought[m];
			
			// Variable to hold number of customers who bought that item.
			
			int customernumber = customers[m];
			
			// If-else statement in case zero customers bought an item.
			
			if (customernumber == 0) {
				System.out.println("No" + " customers bought " + itemname);
			} else {
				System.out.println(customernumber + " customers bought " + itemquantity + " " + itemname);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
