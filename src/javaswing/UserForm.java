package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserForm extends JFrame{
	public UserForm() {
		setSize(800, 200);
		setVisible(true);
		
		//JButton:
		JButton jb = new JButton("Hello");
		jb.setBounds(400, 20, 120, 30);
		add(jb);
		
		// click action:
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello how are you today?");
			}
		});
	}
	
	public static void main(String[] args) {
		new UserForm();
	}
}
