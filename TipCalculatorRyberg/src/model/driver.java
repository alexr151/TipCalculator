package model;

import java.util.Scanner;

public class driver {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter total sales: $");
		double total = in.nextDouble();
		
		TipCalculator tp = new TipCalculator(total);
		
		System.out.println(tp.getTipTotal());
		
		System.out.println(tp.outputTip());
	}

}
