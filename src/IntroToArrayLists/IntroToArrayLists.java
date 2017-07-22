package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Strings = new ArrayList<String>();
		//2. Add five Strings to your list
		Strings.add("one");
		Strings.add("two");
		Strings.add("three");
		Strings.add("four");
		Strings.add("five");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i <Strings.size(); i++) {
			
			System.out.println(Strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s: Strings){
			System.out.println(s);
			
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < Strings.size(); i++) {
			if (i%2==0) {
				System.out.println(Strings.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = Strings.size()-1; i >=0; i--) {
			
			System.out.println(Strings.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s: Strings){
			if(s.contains("e")){
				System.out.println(s);	
			}
			
			
		}
	}
}
