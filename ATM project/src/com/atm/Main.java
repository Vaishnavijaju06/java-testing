package com.atm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose 1 to Check your curent Balance ");
			System.out.println("Choose 2 to Withdraw money");
			System.out.println("Choose 3 to Deposit money ");
			System.out.println("Choose 4 to change pin");
			System.out.println("Choose 5 to exit");
			System.out.print("Choose the operation you want to perform: ");

			int choice = sc.nextInt();
			System.out.println("enter the pin");
			int pin = sc.nextInt();
			switch (choice) {
			case 1:
				atm.checkBalance();

			case 2:
				System.out.print("Enter money to be withdrawn: ");
				double a = sc.nextInt();
				atm.withdraw();
			case 3:
				System.out.println("Enter money to be deposited:");
				double b = sc.nextInt();
				atm.deposit();
			case 4:

				atm.changePin();
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
