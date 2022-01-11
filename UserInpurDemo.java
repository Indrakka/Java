package edu.userinput;

import java.util.Scanner;

public class UserInpurDemo {

	public static void main(String[] args) {
		//User input Demo
		int age;
		String name;
		float fees;
		char gen;
		double loan;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age ");
		age = input.nextInt();
		input.nextLine();
		System.out.println("Enter your name ");
		
		name = input.next();
		
		System.out.println("Enter fees :");
		
		fees = input.nextFloat();
		
		System.out.println("Enter a gender M/F");
		gen = input.next().charAt(0);  
		
		System.out.println("Enter the loan amount");
		loan = input.nextDouble();
			
		System.out.println("Enter your name ");
		name = input.nextLine();
		
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Fees = "+fees);
		System.out.println("Gender = "+gen);
		System.out.println("Loan ="+loan);
		
	}

}
