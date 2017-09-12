package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Comedy {
public static void main(String[] args) {
	Random rand= new Random();
	
	ArrayList<String> jokes = new ArrayList<String>();
	jokes.add("My friend told me an onion is the only food that makes you cry, so I threw a coconut at his face.");
	jokes.add("Q: Why is Peter Pan always flying? \n" + "A: Because he neverlands.");
	jokes.add("A neutron walks into a bar and orders a drink. When the neutron gets his drink, he asks, \"Bartender, how much do I owe you?\"\n" + 
			"The bartender replies, \"For you, neutron, no charge.\"");
	jokes.add("Q: Why did the chewing gum cross the road?\n" + 
			"A: He was stuck to the chicken's foot.");
	int i= rand.nextInt(4);
	JOptionPane.showMessageDialog(null, "You should eat "+jokes.get(i));
}
}
