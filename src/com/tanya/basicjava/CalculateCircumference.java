package com.tanya.basicjava;

import java.util.Scanner;

public class CalculateCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double cir = circumference(r);
		System.out.println("Circumference of circle = " + cir);
		// TODO Auto-generated method stub

	}
	public static double circumference(int r) {
		double circumference = 0;
		circumference = (2 * Math.PI * r);
		return circumference;
	}

}
