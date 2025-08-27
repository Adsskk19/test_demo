package com.flm.tasks;

import java.util.Scanner;

public class CalculateBillWithDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of products bought: ");
		int products = sc.nextInt();
		System.out.println("Is premium user: ");
		boolean premiumUser = sc.nextBoolean();
		
		int costOfEachProduct = 1000;
		int discount = 100;
		
		if(premiumUser ) {
			int c = (products*costOfEachProduct) -(products*discount) ;
			System.out.println(c);
		}else {
			System.out.println(products*costOfEachProduct);
		}
		sc.close();
	}

}
