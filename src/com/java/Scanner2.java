package com.java;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner Srini = new Scanner (System.in);
		System.out.println("Who you are ");
		String Devil = Srini.nextLine();
		System.out.println("Hello "+Devil);
		
		System.out.println("How old are you");
		
		int Year = Srini.nextInt();
		System.out.println("i am " + Year);
		Srini.nextLine();
		System.out.println("where are you from");
		Srini.nextLine();
		String place = Srini.nextLine();
		System.out.println("i am from "+place);
		
		
	}

}
