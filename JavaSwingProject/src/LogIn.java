import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LogIn{
	
	public static void LogIn(){
		
		CourseSelection cSelection = new CourseSelection();
		
		JFrame frame = new JFrame("Log In");
		
		JLabel label1 = new JLabel("Please enter your id:");
		JTextField textField1 = new JTextField(30);
		
		JLabel label2 = new JLabel("Please enter your password:");
		JTextField textField2 = new JTextField(30);
		
		Button button = new Button("Enter");
		
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		frame.getContentPane().add(label1);
		frame.getContentPane().add(textField1);
		
		frame.getContentPane().add(label2);
		frame.getContentPane().add(textField2);
		
		frame.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Welcome!");
				
				cSelection.CourseSelection();
				
				
				
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		frame.setResizable(false);
		frame.setLocation(400, 300);
		
	}
}
