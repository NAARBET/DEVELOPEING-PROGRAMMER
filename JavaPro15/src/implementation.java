import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class implementation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert();
		displayByBook_Id();
		displayByName();
		displayByYear();
		displayByRate();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection a = LibraySearch.getConnection();
		String b = "insert into library(Book_name,Published_year,Price) values(?,?,?)";
		PreparedStatement p = a.prepareStatement(b);
		p.setString(1, "PHYSICS");
		p.setInt(2, 2008);
		p.setInt(3, 100);
		int i = p.executeUpdate();
		a.close();
	}

	public static void displayByBook_Id() throws ClassNotFoundException, SQLException {
		Connection a = LibraySearch.getConnection();
		String b = "select * from library where Book_Id='4'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("Book_Id") + " " + i.getString("Book_name") + " "
					+ i.getString("Published_year") + " " + i.getInt("Price"));
		}
		a.close();
	}

	public static void displayByName() throws ClassNotFoundException, SQLException {
		Connection a = LibraySearch.getConnection();
		String b = "select * from library where Book_name='CHEMISTRY'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("Book_id") + " " + i.getString("Book_name") + " "
					+ i.getString("Published_year") + " " + i.getInt("Price"));
		}
		a.close();
	}

	public static void displayByYear() throws ClassNotFoundException, SQLException {
		Connection a = LibraySearch.getConnection();
		String b = "select * from library where Published_year='2012'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("Book_Id") + " " + i.getString("Book_name") + " "
					+ i.getString("Published_year") + " " + i.getInt("Price"));
		}
		a.close();
	}

	public static void displayByRate() throws ClassNotFoundException, SQLException {
		Connection a = LibraySearch.getConnection();
		String b = "select * from library where Price='100'";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		while (i.next()) {
			System.out.println(+i.getInt("Book_Id") + " " + i.getString("Book_name") + " "
					+ i.getString("Published_year") + " " + i.getInt("Price"));
		}
		a.close();
	}
}
