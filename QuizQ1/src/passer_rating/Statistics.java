package passer_rating;

import java.util.Scanner;

public class Statistics {
	public static void main(String args[]) { 
	    
		Scanner QB_input = new Scanner(System.in);
	    
		System.out.print("Enter Number of Touchdowns: ");
		Double touchdowns = QB_input.nextDouble();
	    
		System.out.print("Enter Number of Total Yards: ");
		Double total_yards = QB_input.nextDouble();
		
	    
		System.out.print("Enter Number of Interceptions: ");
		Double interceptions = QB_input.nextDouble();
		
		
		System.out.print("Enter Number of Completions: ");
		Double completions = QB_input.nextDouble();
		
		System.out.print("Enter Number of Attemtped Passes: ");
		Double attempted_passes = QB_input.nextDouble();
		
		QB_input.close();


		Double a = (completions / attempted_passes - 0.3) * 5.0;

		Double b = (total_yards / attempted_passes - 3.0) *0.25;

		Double c = (touchdowns / attempted_passes) * 20.0;

		Double d = 2.375  - (interceptions / attempted_passes * 25.0);

		Double QB_Rating = ((a + b + c + d) / 6.0) * 100;

		System.out.println(QB_Rating);
	}
	
}		
	