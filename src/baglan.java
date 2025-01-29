import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class baglan {

    public Connection baglan() {
        String yol = "jdbc:mysql://localhost:3308/gallery";
        String kullanici_adi = "root";
        String parola = "";
        Connection conn = null;
        try {
            // Veritabanı bağlantısını kurmaya çalışıyoruz
            conn = DriverManager.getConnection(yol, kullanici_adi, parola);
            if (conn != null) {
                System.out.println("Veritabanı bağlantısı başarılı.");
            }
        } catch (SQLException e) {
            // Hata durumunda kullanıcıya mesaj gösteriyoruz
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Sırasında Bir Hata Oluştu: " + e.getMessage());
        }
        return conn;
    }
}
