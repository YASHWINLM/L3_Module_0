package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton but= new JButton();
	JButton butt= new JButton();
	JButton butt2= new JButton();
	JButton butt3= new JButton();
	HashMap<Integer, String> IDList = new HashMap<Integer, String>();
	public static void main(String[] args) {
		LogSearch log= new LogSearch();
		log.run();
	}
	
public void run(){
		
//	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		panel.setVisible(true);
		but.setVisible(true);
		butt.setVisible(true);
		butt2.setVisible(true);
		butt3.setVisible(true);
		frame.add(panel);
		panel.add(but);
		panel.add(butt);
		panel.add(butt2);
		panel.add(butt3);
		
		but.setText("Add Entry ");
		butt.setText("Search By ID");
		butt2.setText("View List");
		butt3.setText("Remove Entry");
		but.addActionListener(this);
		butt.addActionListener(this);
		butt2.addActionListener(this);
		butt3.addActionListener(this);
		frame.pack();
		
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(but)) {
		
		String ID=JOptionPane.showInputDialog("Enter an ID # that you want to add");
		String name= JOptionPane.showInputDialog("Now enter a name the you want to add");
		int id= Integer.parseInt(ID);
		IDList.put(id, name);
	}
	else if(e.getSource().equals(butt)){
		String Id=JOptionPane.showInputDialog("Enter the ID of a person");
		int person=Integer.parseInt(Id);
		
		
	
		if(IDList.containsKey(person)){
			JOptionPane.showMessageDialog(null, "This is the ID number of " + IDList.get(person));
			
		}
		else{
			JOptionPane.showMessageDialog(null, "This ID does not exist");
		}
		
	}
	else if (e.getSource().equals(butt2)) {
	
		String s="";
		for (Integer i  : IDList.keySet()) {
		String ss= Integer.toString(i);
					s+=" ID: "+ss;
					s+=" Name: "+IDList.get(i)+" \n";
		}
		System.out.println("hello");
		JOptionPane.showMessageDialog(null, s);
		
		
	}
	else if(e.getSource().equals(butt3)){
		String id=JOptionPane.showInputDialog("Enter the ID of the person that you want to remove");
		int person=Integer.parseInt(id);
		IDList.remove(person);
		if(IDList.containsKey(person)){
			JOptionPane.showMessageDialog(null, "ID removed");
			
		}
		else{
			JOptionPane.showMessageDialog(null, "This ID does not exist");
		}
	}
	
}
}
