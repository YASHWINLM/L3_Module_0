package IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	public static void main(String[] args) {
		GuestBook book= new GuestBook();
		book.run();
	}
	
	public void run(){
		ArrayList<String> names = new ArrayList<String>();
		
		names.add(" Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("  Donny Doners");
		JFrame frame= new JFrame();
		frame.pack();
		JPanel panel= new JPanel();
		JButton but= new JButton();
		JButton butt= new JButton();
		frame.setVisible(true);
		panel.setVisible(true);
		but.setVisible(true);
		butt.setVisible(true);
		frame.add(panel);
		panel.add(but);
		panel.add(butt);
		but.setText("Add Name ");
		butt.setText("View Names");
		
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
}
