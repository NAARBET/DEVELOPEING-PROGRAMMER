import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.h2.command.dml.Insert;

public class connectionestablish {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insert();
		/*delete();*/
		display();
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		Connection a = mainProgram.getConnection();
		String b = "insert into student values(3,'name3',3)";
		PreparedStatement p = a.prepareStatement(b);
		int i = p.executeUpdate();
		a.close();
	}

/*	public static void delete() throws ClassNotFoundException, SQLException {
		Connection a = mainProgram.getConnection();
		String b = "delete from student where id=1";
		PreparedStatement p = a.prepareStatement(b);
		int i = p.executeUpdate();
		a.close();
	}*/
	public static void display() throws ClassNotFoundException, SQLException {
		Connection a = mainProgram.getConnection();
		String b = "select* from student where id=2";
		PreparedStatement p = a.prepareStatement(b);
		ResultSet i = p.executeQuery();
		a.close();
	}
}
