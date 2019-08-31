package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Declare and initialize a variable for the number of customers.
		
		int numofcustomers = scan.nextInt();
		
		// Create a for loop in order to cycle through each customer's item list.
		
		for (int i = 0; i < numofcustomers; i++) {
			
			String fname = scan.next();
			String finitial = fname.charAt(0) + ".";
			String lname = scan.next();
			String fullname = finitial + " " + lname;
			
			int numofitems = scan.nextInt();
		
			double totalcost = 0.00;
			

			for (int j = 0; j < numofitems; j++) {
			
				int quantity = scan.nextInt();
				
				scan.next();
				
				double cost = scan.nextDouble();
				
				double itemscost = calculateCostOfItem(quantity, cost);
				
				totalcost += itemscost;
				
			}
			String newtotal = String.format("%.2f", totalcost);
			System.out.println(fullname + ": " + newtotal);
		}
		
		
	}
	static double calculateCostOfItem(int quant, double price) {
		double total = 0.00;
		for (int counter = 0; counter < quant; counter++) {
			total += price;
		}
		return total;
	}
	
}
