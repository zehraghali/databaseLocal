import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddEmployees {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/company_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

                String sql = "INSERT INTO employee_en (first_name, last_name, email) VALUES (?, ?, ?)";

                try (PreparedStatement statement = connection.prepareStatement(sql)) {

                    statement.setString(1, "Amir");      // Etunimi
                    statement.setString(2, "Dirin");     // Sukunimi
                    statement.setString(3, "amir@example.com"); // Sähköposti
                    statement.executeUpdate();

                    statement.setString(1, "Sami");      // Etunimi
                    statement.setString(2, "Jones");     // Sukunimi
                    statement.setString(3, "sami.jones@yahoo.com"); // Sähköposti
                    statement.executeUpdate();

                    System.out.println("Tietueet lisätty onnistuneesti.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
