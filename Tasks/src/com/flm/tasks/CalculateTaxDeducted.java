package com.flm.tasks;

import java.util.Scanner;// ctrl + shift + o to import

public class CalculateTaxDeducted {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your Salary: ");
		 int salary = sc.nextInt() ;
		 
		 if(salary<=250000) {
			 System.out.println("No tax");
		 }else if(salary>250000 && salary <500000) {
			 System.out.println( (int)(salary *0.05) +" tax");
		 }else if(salary>500000 && salary <1000000) {
			 System.out.println( (int)(salary *0.2) +" tax");
		 }else {
			 System.out.println( (int)(salary *0.3) +" tax");
		 }
		 
		 sc.close();
		 
	}

	
	 

}
