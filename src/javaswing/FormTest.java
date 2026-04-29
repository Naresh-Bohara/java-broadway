package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormTest {
	public static void main(String[] args) {
		JFrame form = new JFrame();
		
		form.setSize(600, 400);
		form.setTitle("Test From");
		form.setLayout(null);
		
		// JLabel:
		JLabel jl = new JLabel("Good Morining");
//		jl.setSize(120, 20);
		jl.setBounds(200, 50, 120, 20);
		form.add(jl);
		
		form.setVisible(true);
	}
	
}
