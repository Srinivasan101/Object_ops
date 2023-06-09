package com.java;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		try (Scanner Sri = new Scanner(System.in)) {
			System.out.println("Two Table");
			int number = Sri.nextInt();
			for (int i = 1;i<=10;i++) {
				System.out.println(i+"*"+number+"="+i*number);

				
			}
		}

	}

}
