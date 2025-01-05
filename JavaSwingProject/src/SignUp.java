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
		
		JLabel label1 = new JLabel("Please enter your id as an integer:");
		JTextField textField1 = new JTextField(30);
		
		JLabel label2 = new JLabel("Please enter your name:");
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
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				String idText = textField1.getText(); // Kullanıcının girdiği id değeri

				// Boş değeri kontrol et
				if (idText == null || idText.trim().isEmpty()) {
				    System.out.println("ID boş olamaz!");
				    JOptionPane.showMessageDialog(null, "ID boş olamaz!");
				    return; // İşlemi sonlandır
				}

				// Geçerli bir int değeri olup olmadığını kontrol et
				try {
				    id = Integer.parseInt(idText); // String'i int'e çevir
				} catch (NumberFormatException e1) {
				    System.out.println("Geçersiz ID değeri!");
				    JOptionPane.showMessageDialog(null, "Lütfen geçerli bir ID girin.");
				    return; // İşlemi sonlandır
				}

				// User objesini oluşturun
				User user = new User(id, textField2.getText(), textField3.getText());

				JOptionPane.showMessageDialog(frame, "Your account has been created.");
				user.saveToDatabase();
				
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 300);
		frame.setResizable(false);
		frame.setLocation(400, 300);
	}
	


}
