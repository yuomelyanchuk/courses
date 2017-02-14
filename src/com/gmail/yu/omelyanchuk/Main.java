package com.gmail.yu.omelyanchuk;

import java.util.Scanner;

public class Main {

	private static void digitConsists(int digit) {
		int kolvo = Integer.toString(digit).length();
		while (kolvo > 0) {
			kolvo--;
			System.out.println((int) (digit / Math.pow(10, kolvo)));

			digit = (int) (digit % Math.pow(10, kolvo));
		}
	}

	private static void triangleArea() {
		double a = 0.3;
		double b = 0.4;
		double c = 0.5;
		double p;
		p = (a + b + c) / 2.0;
		double s;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("triangle area= " + s);

	}

	private static void circleLength(double r) {
		System.out.println("circle length= " + 2.0 * Math.PI * r);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//tasc 1
		System.out.println("input digit");
		if (sc.hasNextInt()) {
			digitConsists(sc.nextInt());
		}
		
		//tasc 2
		System.out.println("trianle area is");
		triangleArea();
		
		//tasc 3
		System.out.println("input circle radius");
		if (sc.hasNextDouble()) {
			circleLength(sc.nextDouble());
		}

	}

}
