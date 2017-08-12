package SearchingAndSortingAlgorithms;

import java.util.Collections;
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
		
		
		return -1; //<- this needs changing
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int i=0;
		for (Boolean pearls : oysters) {
			if(pearls==true){
				i+=1;
				
			}
			
			
		}
		System.out.println(i);
		return i;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double biggest=0;
		for  (Double height : peeps) {
			if (biggest<height){
				biggest=height;
				
			}
		}
		System.out.println(biggest);
		return biggest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord=words.get(0);
		
		for (String word : words) {
			if(longestWord.length()<word.length()){
				
				longestWord=word;
			}
			
		}
		System.out.println(longestWord);
		return longestWord;
	}

	public static Object containsSOS(List<String> messages) {
		// TODO Auto-generated method stub
		
		for (String sos : messages) {
			if(sos.equals(" ... --- ... ")){
				System.out.println("Message contains SOS");
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		Collections.sort(results);
		return results;
	}
	
	//Add other methods here
	
}