package com.tanya.basicjava;

import java.util.Scanner;

public class Loop {
	
	public static void  main(String args[]) {
		
		
		
		//print the marks
		Scanner sc = new Scanner(System.in);
		int input; 
		
		
		
		do {
			
			int marks = sc.nextInt();
			if(marks >= 90 && marks <= 100) {
				System.out.println("This is Good");
			} else if (marks >= 60 && marks <= 89) {
				System.out.println("This is also Good");
			} if  (marks >=0 && marks <= 59) {
				System.out.println("This is Good as well");
			}
			//System.out.println("Want to continue ? yes(1) or no(0)");
			input = sc.nextInt();
			
		}  while(input == 1);
	  

			
			 
		
	
	
		
		
		
		
		//printallEvennumber();
		//printTable();
		//sumofFirstnNumber();
	    //printUpto10();
		//print100Hello();
			
}

	private static void printallEvennumber() {
		//Print all even numbers
	Scanner sc = new Scanner(System.in);
	  int n = 87;
	  for (int i = 1 ; i<=n ; i++ ) {
		  if( i % 2 == 0) {
	  
		  System.out.println(i);
		  }
	  }
	}

	private static void print100Hello() {
		//print 100 times hello
		for(int counter = 0; counter < 100; counter = counter + 1 ) {
			System.out.println("Hello World");
		}
	}

	private static void printUpto10() {
		//print number upto10
		for (int counter = 0; counter < 11; counter ++) {
		System.out.println(counter);
		//print in single line
		System.out.print(counter+" ");
		}
	}

	private static void sumofFirstnNumber() {
		//print the sum of first n numbers
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n ; i++){
		sum = sum + i;
		}
		System.out.println(sum );
	}

	private static void printTable() {
		//print the table of a number input by the user
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for( int i = 1 ; i <11 ; i++) {
			System.out.println(i*n);
		}
	}

}
