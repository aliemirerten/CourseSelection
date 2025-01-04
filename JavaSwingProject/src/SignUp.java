import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignUp {
	
	public static void SignUp(){

		JFrame frame = new JFrame("Sign Up");
		
		JLabel label1 = new JLabel("Please enter your first name:");
		JTextField textField1 = new JTextField(30);
		
		JLabel label2 = new JLabel("Please create your id:");
		JTextField textField2 = new JTextField(30);
		
		JLabel label3 = new JLabel("Please create your password:");
		JTextField textField3 = new JTextField(30);
		
		Button button = new Button("Enter");
		
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		frame.getContentPane().add(label1);
		frame.getContentPane().add(textField1);
		
		frame.getContentPane().add(label2);
		frame.getContentPane().add(textField2);
		
		frame.getContentPane().add(label3);
		frame.getContentPane().add(textField3);
		
		frame.getContentPane().add(button);
		
		User user = new User(textField1.getText(), textField2.getText(), textField3.getText());
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Your account has been created.");
				
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		frame.setResizable(false);
		frame.setLocation(400, 300);
	}
	


}
