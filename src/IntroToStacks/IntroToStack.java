package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> flavors = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand = new Random();
		
		
		for (int i = 0; i < 101; i++) {
			flavors.push(rand.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String  num= JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String  num2= JOptionPane.showInputDialog("Enter a bigger number between 0 and 100");
		int Num=Integer.parseInt(num);
		int Num2=Integer.parseInt(num2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int x= flavors.size();
		for (int i = 0; i < x; i++) {
			
			double y=flavors.pop();
			if(y<Num2&& y>Num) {
				System.out.println(y);
				
			}
			
		}
		if(flavors.isEmpty()) {
			System.out.println("empty");
			
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
