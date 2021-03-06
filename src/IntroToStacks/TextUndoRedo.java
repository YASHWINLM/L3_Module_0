package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	Stack<Character> letters = new Stack<Character>();
	Stack<Character> Undone = new Stack<Character>();
	public static void main(String[] args) {
		TextUndoRedo text= new TextUndoRedo();
		text.run();
	}
	private void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		panel.setVisible(true);
		label.setVisible(true);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		

	}
	public String getStack() {
		String s ="" ;
		for (int i = 0; i <letters.size(); i++) {
		
			s+=letters.elementAt(i);
			
		}
		return s;
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	if(e.getKeyCode()==8) {
			
			char c=letters.pop();
			Undone.push(c);
			
		}
	else if(e.getKeyCode()==27) {
		char c=Undone.pop();
		letters.push(c);
	}
		else  {
			char f=e.getKeyChar();
			letters.push(f);
		}
		
			
		
		String s=getStack();
		label.setText(s);
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
