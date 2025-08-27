package com.flm.tasks;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = sc.nextInt();
		System.out.println("Enter Number 2");
		int b = sc.nextInt();
		System.out.println("Enter Number 3");
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("Largest number: "+ a);
		}else if (b>=a && b>=c) {
			System.out.println("Largest number: "+ b);			
		}else {
			System.out.println("Largest number: "+ c);
		}
		
		sc.close();
	}

}

// a>b&& a>c --> a is largest
// a>b && a<c --> C is largest
//a<b && b>c --> B is largest