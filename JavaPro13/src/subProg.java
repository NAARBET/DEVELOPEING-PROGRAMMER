import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class subProg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert();
		displayById();
		displayByName();
		displayByDesigination();
		displayBySalery();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "insert into employeedetails(name,desigination,salery) values(?,?,?)";
		PreparedStatement p = a.prepareStatement(b);
		p.setString(1, "");
		p.setString(2, " Co-Manager");
		p.setInt(3,40000);
		int i = p.executeUpdate();
		a.close();
	}

	public static void displayById() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "select * from employeedetails where id='4'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("id") + " " + i.getString("name") + " " + i.getString("desigination") + " "
					+ i.getInt("salery"));
		}
		a.close();

	}

	public static void displayByName() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "select * from employeedetails where name='Abilash'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("id") + " " + i.getString("name") + " " + i.getString("desigination") + " "
					+ i.getInt("salery"));
		}
		a.close();

	}

	public static void displayByDesigination() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "select * from employeedetails where desigination='CO-CEO'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("id") + " " + i.getString("name") + " " + i.getString("desigination") + " "
					+ i.getInt("salery"));
		}
		a.close();

	}

	public static void displayBySalery() throws ClassNotFoundException, SQLException {
		Connection a = conn.getConnection();
		String b = "select * from employeedetails where salery='90000'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("id") + " " + i.getString("name") + " " + i.getString("desigination") + " "
					+ i.getInt("salery"));
		}
		a.close();

	}
}
