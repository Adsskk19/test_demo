package com.flm.tasks;

public class TernaryOperatorTask {
	public static void main(String[] args) {
		int marks = 56;
		
	//	String res = (marks>90)? "Grade A":(marks>70)?" Grade B":(marks>50)?"Grade C": "Fail";
		
		String res = (marks>90)&& (marks<=100)? "Grade A" : (marks>70)&& (marks<=90)?"Grade B": 
			(marks>50)&& (marks<=70)?"Grade C":"fail";
		
		
		
		
		
		
		
		
		System.out.println(res);
		
		
		
		
	}

}
