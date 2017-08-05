package SearchingAndSortingAlgorithms;

import java.util.List;

import javax.swing.JOptionPane;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int i=0;

		for (String egg : eggs) {
			if (egg.equals("cracked")) {
				return i;	
				}	
			i+=1;
			System.out.println(egg);
			
				
			}
		
		
		return 4; //<- this needs changing
	}
	
	//Add other methods here
	
}