import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.sql.*;

public class LogIn {

    public static void LogIn() {
    	
    	CourseSelection cSelection = new CourseSelection();
    	
        JFrame frame = new JFrame("Log In");

        // Kullanıcı adı ve şifre alanları
        JLabel label1 = new JLabel("Username:");
        JTextField textField1 = new JTextField(30);

        JLabel label2 = new JLabel("Password:");
        JTextField textField2 = new JTextField(30);

        Button button = new Button("Log In");

        // Layout
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(textField2);
        frame.getContentPane().add(button);

        // Button event handler
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();  // Kullanıcı adı
                String password = textField2.getText();  // Şifre

                // Kullanıcı adı ve şifrenin boş olup olmadığını kontrol et
                if (username.trim().isEmpty() || password.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Username and Password cannot be empty!");
                    return;
                }

                // Veritabanı bağlantısı
                try {
                    // Veritabanı bağlantısı
                    String url = "jdbc:mysql://127.0.0.1:3306/users"; // Veritabanı URL
                    String dbUser = "root"; // MySQL kullanıcı adı
                    String dbPassword = "Emirsql+04"; // MySQL şifresi

                    Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);

                    // SQL sorgusu - kullanıcı adı ve şifreyi kontrol et
                    String sql = "SELECT * FROM users WHERE name = ? AND password = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, username);
                    pstmt.setString(2, password);

                    // Sorgu çalıştırma
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        // Kullanıcı adı ve şifre doğruysa
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        cSelection.CourseSelection();
                        
                    } else {
                        // Kullanıcı adı veya şifre hatalıysa
                        JOptionPane.showMessageDialog(null, "Invalid username or password!");
                    }

                    // Bağlantıyı kapatma
                    conn.close();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error connecting to database.");
                }
            }
        });

        // JFrame ayarları
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setLocation(400, 300);
    }
}
