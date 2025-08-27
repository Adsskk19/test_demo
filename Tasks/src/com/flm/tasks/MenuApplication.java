package com.flm.tasks;

import java.util.Scanner;

public class MenuApplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Order Sir:  ");
		int order = sc.nextInt();
		
		switch(order) {
		    case 1:
		    	System.out.println("Your Chicken 65 order place successfully");
				break;
		    case 2:
		    	System.out.println("Your Panner order place successfully");
				break;
		    case 3:
		    	System.out.println("Your Biryani order place successfully");
				break;
			default :
				System.out.println("Inavlid Order Input....");
			
		}
		sc.close();
	}

}
