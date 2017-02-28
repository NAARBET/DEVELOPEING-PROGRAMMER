
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LibraySearch {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		String url = "jdbc:h2:tcp://localhost/~/My Server";
		Connection a = DriverManager.getConnection(url, "sa", "");
		System.out.println(a);
		return a;
	}
}


