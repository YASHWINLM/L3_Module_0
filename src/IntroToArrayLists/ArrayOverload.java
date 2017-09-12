package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class ArrayOverload {
public static void main(String[] args) {
	ArrayList<Integer> ints= new ArrayList<Integer>();
	Random rand= new Random();
	int i= rand.nextInt();
	for (int j = 0; j < 1000000000; j++) {
		ints.add(i);
	}
}
	
}
