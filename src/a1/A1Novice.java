package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numofcustomers = scan.nextInt();
		
		
		for (int i = 0; i < numofcustomers; i++) {
			String fname = scan.next();
			
			String finitial = fname.charAt(0) + ".";
			
			String lname = scan.next();
			
			String fullname = finitial + " " + lname;
			
			int numofitems = scan.nextInt();
			double totalcost = 0;
			for (int j = 0; j < numofitems; j++) {
				int quantity = scan.nextInt();
				scan.next();
				double cost = scan.nextDouble();
				totalcost = calculateCostOfItem(quantity, cost);
			}
			System.out.println(fullname + ": " + totalcost);
		}
		
		
	}
	static double calculateCostOfItem(int quant, double price) {
		for (int counter = 1; counter < quant; counter++) {
			price = price + price;
		}
		return price;
	}
	
}
