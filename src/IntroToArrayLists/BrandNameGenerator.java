package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BrandNameGenerator {
	public static void main(String[] args) {
		
	
	Random rand= new Random();
	ArrayList<String> adj = new ArrayList<String>();
	ArrayList<String> noun = new ArrayList<String>();

adj.add(" slimy ");
adj.add(" fast ");
adj.add(" old ");
adj.add(" stupid ");

noun.add("bears");
noun.add(" hats ");
noun.add(" cars ");
noun.add(" chairs ");
		int i= rand.nextInt(4);
		int j= rand.nextInt(4);
	JOptionPane.showMessageDialog(null, adj.get(i)+noun.get(j));
}}
