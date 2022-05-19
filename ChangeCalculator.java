//This code will let the user enter an amount in dollars."Only whole numbers, no change"
//Then will convert that money to how much it would be in quarters, dimes, nickels, and pennies

import java.util.Scanner;

public class ChangeCalculator{
	
	public static void  main (String [] args){
		
		String menu = "1.Convert to Quarters\n2.Convert to Nickels\n3.Dimes\n4.Pennies\n5.All\n6.Exit";
		int number = 0;
		Scanner input = new Scanner (System.in);
		double amount = 0;
		
		System.out.println("\tWelcome to the Change Calculator!!");
		System.out.println("\nPlease enter the USD amount that you would like to convert in change." + "\nWARNING!! Only enter a whole number amount please.");
		
		
		System.out.println("\nEnter amount:");
		amount = input.nextDouble();
		
		if (amount%1 !=0){
			System.out.println("Did not enter a correct value, so the program was exited. Please try again.");
			System.exit(0);
		}	
		
		System.out.println("\nPlease pick a number from the menu:\n " + menu);
		number = input.nextInt();
		
		switch(number){
		
			case 1:
				Quarters(amount);
				break;
				
			case 2:
				Nickels(amount);
				break;
			
			case 3:
				Dimes(amount);
				break;
			
			case 4:
				Pennies(amount);
				break;
				
			case 5:
				Quarters(amount);
				Nickels(amount);
				Dimes(amount);
				Pennies(amount);
				break;
				
			case 6:
				System.exit(0);
				break;
				
				
			default:
		
		}
		
	}
	
	
	public static void Quarters(double amount){
		
		double quarters = 0.25;
		double divQuarters = 0;
		
		divQuarters = amount/quarters;
		System.out.println("Your amount in quarters is "+divQuarters);
		
	}	
	
	public static void Nickels(double amount){
		
		double nickles = 0.05;
		double divNickels = 0;
		
		divNickels = amount/nickles;
		System.out.println("Your amount in nickels is "+divNickels);
		
	}

	public static void Dimes(double amount){
		
		double dimes = 0.10;
		double divDimes = 0;
		
		divDimes = amount/dimes;
		System.out.println("Your amount in dimes is "+divDimes);
	
	}
	
	public static void Pennies(double amount){
		
		double pennies = 0.01;
		double divPennies = 0;
		
		divPennies = amount/pennies;
		System.out.println("Your amount in pennies is "+divPennies);
		
	}	
}




