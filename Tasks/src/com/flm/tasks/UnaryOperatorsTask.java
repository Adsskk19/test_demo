package com.flm.tasks;

public class UnaryOperatorsTask {
	public static void main(String[] args) {
		short a = 1;
		short b = -2;
		boolean res= true;
		
		System.out.println(+a);
		System.out.println(-b);
		System.out.println(!res);
		
		System.out.println(a++); //1
		System.out.println(a); //2
		System.out.println(++a); //3
		
		short c = 12;
		System.out.println(c--);// 12
		System.out.println(c);//11
		System.out.println(--c);//10
	}

}
