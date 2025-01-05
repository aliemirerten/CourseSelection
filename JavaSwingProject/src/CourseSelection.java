import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CourseSelection {
	
	public static void CourseSelection() {
		
		//Kurslar : Java, Python, C++, C, C#
	
	JFrame frame = new JFrame("Course Selection");
	JLabel label = new JLabel("Please select your courses:");
	
	JRadioButton javaRadioButton = new JRadioButton("Java");
	JRadioButton pythonRadioButton = new JRadioButton("Python");
	JRadioButton cppRadioButton = new JRadioButton("C++");
	JRadioButton cRadioButton = new JRadioButton("C");
	JRadioButton csharpRadioButton = new JRadioButton("C#");
	
	JButton button = new JButton("Enter");
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String selectedCourse = "The selected courses:\n";
			boolean isSelected = false;
			
			if(javaRadioButton.isSelected()) {
				selectedCourse = selectedCourse + "Java, ";
				isSelected = true;
			}
			if(pythonRadioButton.isSelected()) {
				selectedCourse = selectedCourse + "Python, ";
				isSelected = true;
			}
			if(cppRadioButton.isSelected()) {
				selectedCourse = selectedCourse + "C++, ";
				isSelected = true;
			}
			if(cRadioButton.isSelected()) {
				selectedCourse += "C, ";	
				isSelected = true;
			}
			if(csharpRadioButton.isSelected()) {
				selectedCourse += "C#, ";
				isSelected = true;
			}
			if(!isSelected) {
				selectedCourse = "No lecture has been selected.";
			}
			JOptionPane.showMessageDialog(frame, selectedCourse);
		}
	});
	
	
	frame.getContentPane().setLayout(new FlowLayout());
	
	frame.getContentPane().add(label);
	frame.getContentPane().add(javaRadioButton);
	frame.getContentPane().add(pythonRadioButton);
	frame.getContentPane().add(cppRadioButton);
	frame.getContentPane().add(cRadioButton);
	frame.getContentPane().add(csharpRadioButton);
	frame.getContentPane().add(button);
	
	frame.setVisible(true);
	frame.setLocation(400,400);
	frame.setSize(500,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

	}
}
