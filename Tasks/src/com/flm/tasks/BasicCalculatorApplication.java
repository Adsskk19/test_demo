package com.flm.tasks;

import java.util.Scanner;

public class BasicCalculatorApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input:  ");
        String input = sc.nextLine();
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        
        switch(input) {
        case "+":
        	System.out.println("Your ouput is: "+ (a+b));
        	break;
        case "-":
        	//int c = a-b;
        	System.out.println("Your ouput is: "+ (a-b));
        	break;	
        case "*":
        	System.out.println("Your ouput is: "+ (a*b));
        	break;
        case "/":
        	System.out.println("Your ouput is: "+ (a/b));
        	break;
        case "%":
        	System.out.println("Your ouput is: "+ (a%b));
        	break;	
        default:
        	System.out.println("Invalid Input....");

        }
        
        sc.close();
	}
	
}
