package com.tanya.basicjava;

import java.util.Scanner;

public class FindGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x!=y) {
			// both numbers are equal
		int gt = greaterNumber(x,y);
		System.out.println("Greater Number = " + gt);
		}else {
			System.out.println("Both Numbers are same please enter different numbers. ");
		}
		// TODO Auto-generated method stub

	}
	public static int greaterNumber(int x, int y) {
		if(x>y) {
			return x;
		}else
			return y;
	}
	

}
