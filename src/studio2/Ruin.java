package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		//inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Starting amount: ");
		double startAmount = in.nextDouble();
		System.out.print("How much do you want to win?: ");
		double winLimit = in.nextDouble();
		System.out.print("Win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Total days?: ");
		double totalSims = in.nextDouble();
		
		//Ruin Rate
		double a = ((1-winChance)/winChance);
		double ruin = ((Math.pow(a, startAmount)-(Math.pow(a, winLimit))/(1-Math.pow(a, winLimit))));
		System.out.println(ruin);
		
		//Simulation Win or Lose
		double d = 0;
		while(d<totalSims||startAmount>0||startAmount==winLimit) {
			
			if(Math.random()<winChance) {
				startAmount = startAmount * 2;
			}
			else {
				startAmount = startAmount / 2;

			}
			d = d+1;
			
		}
				
 
		
		System.out.println(startAmount);
	}

}
