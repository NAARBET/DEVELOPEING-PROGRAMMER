import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class subProg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert();
	}
	public static void insert() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "insert into employeedetails(name,desigination,salery) values('Xavier','CO-CEO',90000),('Abilash','Manager',60000),('Shoban','Co-Manager',40000)";
		PreparedStatement p = a.prepareStatement(b);
		int i = p.executeUpdate();
		a.close();
	}
}
