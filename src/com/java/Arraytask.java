package com.java;

public class Arraytask {

	public static void main(String[] args) {
		int sriCount =0, maniCount=0, rajCount=0;
		String name [] = {"sri","sri","sri","mani","mani","mani","raj","raj","raj"};
		
		for(int i =0;i < name.length;i++) {
				if(name[i] == "sri") {
					sriCount++;
				}
				if(name[i] == "mani") {
					maniCount++;
				}
				if(name[i] == "raj") {
					rajCount++;
				}
		}
					System.out.println("sri = "+sriCount);
					System.out.println("mani = "+maniCount);
					System.out.println("raj = "+rajCount);
				

}
	}







