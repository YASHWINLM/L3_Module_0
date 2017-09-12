package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class DinnerDecider {
	
	
	public static void main(String[] args) {
		Random rand= new Random();
		ArrayList<String> food = new ArrayList<String>();

		food.add("Chicken");
		food.add("steak");
		food.add("a burger");
		food.add("nothing");
			int i= rand.nextInt(4);
		JOptionPane.showMessageDialog(null, "You should eat "+food.get(i));
	}
}
