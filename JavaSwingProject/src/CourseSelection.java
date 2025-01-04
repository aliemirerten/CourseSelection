import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	
	frame.getContentPane().setLayout(new FlowLayout());
	
	frame.getContentPane().add(label);
	frame.getContentPane().add(javaRadioButton);
	frame.getContentPane().add(pythonRadioButton);
	frame.getContentPane().add(cppRadioButton);
	frame.getContentPane().add(cRadioButton);
	frame.getContentPane().add(csharpRadioButton);
	
	frame.setVisible(true);
	frame.setLocation(400,400);
	frame.setSize(500,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

	}
}
