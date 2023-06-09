package com.java;

public class Arraytaskdone {

	public static void main(String[] args) {
		short TVS = 0, HERO = 0, HONDA = 0, YAMAHA = 0,TATA = 0;
		String Bikes [] = {"tvs","tvs","hero","hero","honda","honda","yamaha","yamaha","yamaha","tata"};
		for(short S = 0; S < Bikes.length;S++) {
			if(Bikes [S] == "tvs") {
				TVS++;
			}
			if(Bikes[S] == "hero") {
				HERO++;
			}
			if(Bikes [S] == "honda") {
				HONDA++;
			}
			if(Bikes [S] == "yamaha") {
				YAMAHA++;
			}
			if(Bikes [S] == "tata") {
				TATA++;
			}
		}
			System.out.println("tvs ="+TVS);
			System.out.println("hero ="+HERO);
			System.out.println("honda ="+HONDA);
			System.out.println("yamaha ="+YAMAHA);
			System.out.println("tata ="+TATA);

	}

}
