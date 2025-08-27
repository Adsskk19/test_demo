package com.flm.tasks;

import java.util.Scanner;

public class EvenAndMutipleOfFive {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			if(num%5==0) {
	    	System.out.println("Number is Even and Divisble by 5");	
			}else {
			System.out.println("Number is Even and Not Divisble by 5");
			}
		}else {
			System.out.println("Number is Odd");
		}
		
		sc.close();
		
	}

}
