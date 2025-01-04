import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		SignUp signUp = new SignUp();
		LogIn logIn = new LogIn();
		
		JFrame frame = new JFrame("");
		
		JLabel label = new JLabel("Please select if you want to sign up or log in.");
		JLabel label2 = new JLabel("Please create an account if you don't have one.");
		Button bsu = new Button("Sign Up");
		Button bli = new Button("Log In");
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(bsu);
		frame.getContentPane().add(bli);
		
		bsu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signUp.SignUp();
				
			}
		});
		bli.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				logIn.LogIn();
				
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setLocation(400, 300);

		
			

	}

}
