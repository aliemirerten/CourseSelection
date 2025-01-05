import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
	
	private int id;
	private String name;
	private String password;
	
	public User(int id,String name, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	// Kullanıcıyı veritabanına ekleyen metod
    public void saveToDatabase() {
        // Veritabanı bağlantı bilgileri
        String url = "jdbc:mysql://127.0.0.1:3306/users";  // Veritabanı URL'si
        String user = "root";  // Veritabanı kullanıcı adı
        String pass = "Emirsql+04";  // Veritabanı şifresi

        // SQL INSERT komutu
        String sql = "INSERT INTO users (id, name, password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Parametreleri ayarlama
            stmt.setInt(1, this.id);
            stmt.setString(2, this.name);
            stmt.setString(3, this.password);

            // Sorguyu çalıştırma
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Kullanıcı başarıyla veritabanına eklendi.");
            }

        } catch (SQLException e) {
            System.out.println("Veritabanına veri eklenirken hata oluştu: " + e.getMessage());
        }
    }
	
	

}
